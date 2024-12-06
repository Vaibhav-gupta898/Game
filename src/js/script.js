document.getElementById('registrationForm').addEventListener('submit', function(event) {
    event.preventDefault();
    // Handle registration logic here
    const username = document.getElementById('regUsername').value;
    const email = document.getElementById('regEmail').value;
    const password = document.getElementById('regPassword').value;
    // Simulate registration success
    document.getElementById('regMessage').innerText = 'Registration successful for ' + username;
});

document.getElementById('loginForm').addEventListener('submit', function(event) {
    event.preventDefault();
    // Handle login logic here
    const username = document.getElementById('loginUsername').value;
    const password = document.getElementById('loginPassword').value;
    // Simulate login success
    document.getElementById('loginMessage').innerText = 'Login successful for ' + username;
});