package org.ludo.gameLogic;

public class Piece {
  //doesn't change
  private final int colorIndex;
  private final int initialPosIndex;

  //desides its position on the board
  private int posIndex;
  private org.ludo.gamelogic.Areas boardArea;

  //renders the piece
  private org.ludo.gamelogic.PieceNode pieceNode;

  public Piece(int colorIndex, int initialPosIndex) {
    this.colorIndex = colorIndex;
    this.initialPosIndex = initialPosIndex;
    this.posIndex = initialPosIndex;
    setBoardArea(YARD);
  }

  public Piece(int colorIndex, int initialPosIndex, int posIndex, org.ludo.gamelogic.Areas boardArea) {
    this.colorIndex = colorIndex;
    this.initialPosIndex = initialPosIndex;
    this.posIndex = posIndex;
    setBoardArea(boardArea);
  }


  public int getPosIndex() {
    return posIndex;
  }

  public void setPosIndex(int posIndex) {
    this.posIndex = posIndex;
  }

  public void setBoardArea(org.ludo.gamelogic.Areas boardArea) {
    this.boardArea = boardArea;
  }

  public Areas getBoardArea() {
    return boardArea;
  }

  public int getColorIndex() {
    return colorIndex;
  }

  public int getInitialPosIndex() {
    return initialPosIndex;
  }

  public void setPieceNode(PieceNode pieceNode) {
    this.pieceNode = pieceNode;
  }

  public PieceNode getPieceNode() {
    return pieceNode;
  }

  @Override
  public String toString() {
    return "Piece{" +
            "colorIndex=" + colorIndex +
            ", initialPosIndex=" + initialPosIndex +
            ", posIndex=" + posIndex +
            ", boardArea='" + boardArea + '\'' +
            '}';
  }
}
