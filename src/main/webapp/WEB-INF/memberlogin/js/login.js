(() => {
  const username = document.querySelector('#username');
  const password = document.querySelector('#password');
  const errMsg = document.querySelector('#errMsg');
  document.getElementById('btn1').addEventListener('click', () => {
    fetch('login', {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify({
        username: username.value,
        password: password.value
      }),
    })
      .then(resp => resp.json())
      .then(body => {
        errMsg.textContent = '';
        const { successful, message } = body;
        if (successful) {
          const { id, nickname, roleId } = body;
          sessionStorage.setItem('id', id);
          sessionStorage.setItem('nickname', nickname);
          sessionStorage.setItem('roleId', roleId);
          location = '../index.html';
        } else {
          errMsg.textContent = message;
        }
      });
  });
})();