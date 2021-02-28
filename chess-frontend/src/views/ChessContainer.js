/* React imports */

/*****************/

/* CSS imports */

/***************/

/* React Bootstrap imports */
import Container from 'react-bootstrap/Container';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';
/***************************/

/* react95 imports */
import { ThemeProvider } from 'styled-components';
/*******************/

/* project component imports */
import ChessBoard from './ChessBoard.js';
/*****************************/

function ChessContainer() {
  return (
    <Row>
      <Col>
      </Col>

      <Col>
        <ChessBoard />
      </Col>

      <Col>
      </Col>
    </Row>
  );
}

export default ChessContainer;
