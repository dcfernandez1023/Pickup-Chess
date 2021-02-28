/* React imports */

/*****************/

/* CSS imports */
import '../styles/ChessHeader.css';
/***************/

/* React Bootstrap imports */
import Container from 'react-bootstrap/Container';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';
/***************************/

/* react95 imports */
import { ThemeProvider } from 'styled-components';
import millenium from "react95/dist/themes/millenium";
import { AppBar } from 'react95';
/*******************/

function ChessHeader() {
  return (
    <ThemeProvider theme = {millenium}>
      <AppBar className = "ChessNavbar">
          <Row>
            <Col>
              <p className = "ChessHeader"> ♟️ Pickup Chess </p>
            </Col>
          </Row>
      </AppBar>
    </ThemeProvider>
  );
}

export default ChessHeader;
