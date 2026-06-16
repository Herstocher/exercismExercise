class Darts {
    int score(double xOfDart, double yOfDart) {
        int points = 0;
        if (Math.pow(xOfDart,2) + Math.pow(yOfDart,2) <= Math.pow(1,2)){
            points += 10;
        } else if (Math.pow(xOfDart,2) + Math.pow(yOfDart,2) <= Math.pow(5,2)){
            points += 5;
        } else if (Math.pow(xOfDart,2) + Math.pow(yOfDart,2) <= Math.pow(10,2)){
            points += 1;
        }

        return points;
        
    }
}
