/* React imports */

/*****************/

/* CSS imports */
import 'bootstrap/dist/css/bootstrap.min.css';
import './styles/App.css';
/***************/

/* React Bootstrap imports */
import Container from 'react-bootstrap/Container';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';
/***************************/

/* react95 imports */
import { createGlobalStyle, ThemeProvider } from 'styled-components';
import { styleReset } from 'react95';
import original from "react95/dist/themes/original";
import ms_sans_serif from "react95/dist/fonts/ms_sans_serif.woff2";
import ms_sans_serif_bold from "react95/dist/fonts/ms_sans_serif_bold.woff2";
/*******************/

/* project component imports */
import ChessHeader from './views/ChessHeader.js';
import ChessContainer from './views/ChessContainer.js';
/*****************************/

/* global styles for react95 */
const GlobalStyles = createGlobalStyle`
  @font-face {
    font-family: 'ms_sans_serif';
    src: url('${ms_sans_serif}') format('woff2');
    font-weight: 400;
    font-style: normal
  }
  @font-face {
    font-family: 'ms_sans_serif';
    src: url('${ms_sans_serif_bold}') format('woff2');
    font-weight: bold;
    font-style: normal
  }
  body {
    font-family: 'ms_sans_serif';
  }
  ${styleReset}
`;

function App() {
  return (
    <body>
      <GlobalStyles />
      <ThemeProvider theme={original}>
        <ChessHeader />
      </ThemeProvider>
    </body>
  );
}

export default App;
