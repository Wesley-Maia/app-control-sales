import logo from '../../assets/img/logo.svg';

import './styles.css';

function Header() {
  return (
    <header>
      <div className="dsmeta-logo-container">
        <img src={logo} alt="App - Control Sales" />
        <h1>App - Control Sales</h1>
        <p>
          Desenvolvido por
          <a href="https://www.linkedin.com/in/wesley-om/"> @wesley-om</a>
        </p>
      </div>
    </header>
  );
}

export default Header;
