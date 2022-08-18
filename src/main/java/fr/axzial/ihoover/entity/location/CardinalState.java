package fr.axzial.ihoover.entity.location;

import lombok.Getter;

@Getter
public enum CardinalState {
    N(0, 1),
    E(1, 0),
    S(0, -1),
    W(-1, 0);

    final int X;
    final int Y;

    CardinalState(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }
    
    public boolean isXAxis(){
        return Y == 0;
    }

    public boolean isYAxis(){
        return X == 0;
    }

    public CardinalState plus90(){
        return switch (this){
            case N -> CardinalState.E;
            case E -> CardinalState.S;
            case S -> CardinalState.W;
            case W -> CardinalState.N;
        };
    }

    public CardinalState minus90(){
        return switch (this){
            case N -> CardinalState.W;
            case E -> CardinalState.N;
            case S -> CardinalState.E;
            case W -> CardinalState.S;
        };
    }

}
