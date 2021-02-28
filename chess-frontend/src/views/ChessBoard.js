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
import {
  Panel
} from 'react95';
/*******************/

/* project component imports */

/*****************************/

function ChessBoard() {
  return (
    <Panel
      variant = "outside"
      shadow
    >
      <p> The chess board goes here ! </p>
    </Panel>
  );
}

export default ChessBoard;
