import logo from '../../assets/img/logo.svg';
import './styles.css';

function Header() {
    return (
        <header>
            <div className="dsmeta-logo-container">
                <img src={logo} alt="DSMeta logo" />
                <h1>DSMeta</h1>
                <p>Develop by <a href="https://github.com/jmmarao">João Mateus Marão Domingues</a></p>
            </div>
        </header>
    )
}

export default Header;