public enum MoveType {
    U, D, L, R,
//    UP2, DOWN2, LEFT2, RIGHT2,NOTHING
//    UPLEFT, DOWNLEFT, LEFTUP, RIGHTUP, UPRIGHT, DOWNRIGHT, LEFTDOWN, RIGHTDOWN
    // Make sure every 4 of the types are sorted in the same order of UP, DOWN, LEFT, RIGHT
    // buildGraph uses this to filter out some invalid moves.
}