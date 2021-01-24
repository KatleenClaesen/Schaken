
package Bewegen;

/**
 * Soorten bewegingen
 * Klasse die gebruikt werd om de code korter te proberen te schrijven
 * Niet gelukt
 * 
 * @author Katleen
 */
public class Beweging {
    

    ///////////////////////////////////////
    // "ONEINDIGE" RECHTE VERPLAATSINGEN //
    // Bruikbaar voor KONINGIN en TOREN  //
    ///////////////////////////////////////

    /**
     * Verplaats over de hele lijn horizontaal
     * 
     * @param beginx De Startcoordinaat x
     * @param beginy De Startcoordinaat y
     * @param eindx  De Nieuwe x-coordinaat
     * @param eindey De Nieuwe y-coordinaat
     */
    public boolean OnHorizontaal(int beginx, int beginy, int eindx, int eindy) {
        if (beginx == eindx && eindy < 8 && eindy > -1) {
            return true;
        }
        return false;
    }

    /**
     * Verplaats over de hele lijn verticaal
     *
     * @param beginx De Startcoordinaat x
     * @param beginy De Startcoordinaat y
     * @param eindx  De Nieuwe x-coordinaat
     * @param eindey De Nieuwe y-coordinaat
     */
    public boolean OnVerticaal(int beginx, int beginy, int eindx, int eindy) {
        if (beginy == eindy && eindx < 8 && eindx > -1) {
            return true;
        }
        return false;
    }

    
    ///////////////////////////////////////
    // "ONEINDIGE" RECHTE VERPLAATSINGEN //
    // Bruikbaar voor KONINGIN en LOPER  //
    ///////////////////////////////////////

    /**
     * Verplaats over de hele lijn schuin (links onder naar rechts boven)
     * 
     * @param beginx De Startcoordinaat x
     * @param beginy De Startcoordinaat y
     * @param eindx  De Nieuwe x-coordinaat
     * @param eindey De Nieuwe y-coordinaat
     */
    public boolean OnRechtsBoven(int beginx, int beginy, int eindx, int eindy) {
        if (beginy < eindy && beginx > eindx) {
            if (eindx < 8 && eindx > -1 && eindy < 8 && eindy > -1) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verplaats over de hele lijn schuin (rechts boven naar links onder)
     * 
     * @param beginx De Startcoordinaat x
     * @param beginy De Startcoordinaat y
     * @param eindx  De Nieuwe x-coordinaat
     * @param eindey De Nieuwe y-coordinaat
     */
    public boolean OnLinksOnder(int beginx, int beginy, int eindx, int eindy) {
        if (beginy > eindy && beginx < eindx) {
            if (eindx < 8 && eindx > -1 && eindy < 8 && eindy > -1) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verplaats over de hele lijn schuin (rechts onder naar links boven)
     * 
     * @param beginx De Startcoordinaat x
     * @param beginy De Startcoordinaat y
     * @param eindx  De Nieuwe x-coordinaat
     * @param eindey De Nieuwe y-coordinaat
     */
    public boolean OnLinksBoven(int beginx, int beginy, int eindx, int eindy) {
        if (beginy > eindy && beginx > eindx) {
            if (eindx < 8 && eindx > -1 && eindy < 8 && eindy > -1) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verplaats over de hele lijn schuin (links boven naar rechts onder)
     * 
     * @param beginx De Startcoordinaat x
     * @param beginy De Startcoordinaat y
     * @param eindx  De Nieuwe x-coordinaat
     * @param eindey De Nieuwe y-coordinaat
     */
    public boolean OnRechtsOnder(int beginx, int beginy, int eindx, int eindy) {
        if (beginy < eindy && beginx < eindx) {
            if (eindx < 8 && eindx > -1 && eindy < 8 && eindy > -1) {
                return true;
            }
        }
        return false;
    }

    
    
    ///////////////////////////////////
    // EINDIGE RECHTE VERPLAATSINGEN //
    // Bruikbaar voor KONING en PION //
    ///////////////////////////////////

    /**
     * Verplaats 1 vakje naar rechts
     * 
     * @param beginx De Startcoordinaat x
     * @param beginy De Startcoordinaat y
     * @param eindx  De Nieuwe x-coordinaat
     * @param eindey De Nieuwe y-coordinaat
     */
    public boolean Rechts(int beginx, int beginy, int eindx, int eindy) {
        if (beginx == eindx && beginy +1 == eindy) {
            if (eindx < 8 && eindx > -1 && eindy < 8 && eindy > -1) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verplaats 1 vakje naar links
     * 
     * @param beginx De Startcoordinaat x
     * @param beginy De Startcoordinaat y
     * @param eindx  De Nieuwe x-coordinaat
     * @param eindey De Nieuwe y-coordinaat
     */
    public boolean Links(int beginx, int beginy, int eindx, int eindy) {
        if (beginx == eindx && beginy - 1 == eindy) {
            if (eindx < 8 && eindx > -1 && eindy < 8 && eindy > -1) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verplaats 1 vakje naar boven
     * 
     * @param beginx De Startcoordinaat x
     * @param beginy De Startcoordinaat y
     * @param eindx  De Nieuwe x-coordinaat
     * @param eindey De Nieuwe y-coordinaat
     */
    public boolean Boven(int beginx, int beginy, int eindx, int eindy) {
        if (beginx - 1 == eindx && beginy == eindy) {
            if (eindx < 8 && eindx > -1 && eindy < 8 && eindy > -1) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verplaats 1 vakje naar onder
     * 
     * @param beginx De Startcoordinaat x
     * @param beginy De Startcoordinaat y
     * @param eindx  De Nieuwe x-coordinaat
     * @param eindey De Nieuwe y-coordinaat
     */
    public boolean Onder(int beginx, int beginy, int eindx, int eindy) {
        if (beginx + 1 == eindx && beginy == eindy) {
            if (eindx < 8 && eindx > -1 && eindy < 8 && eindy > -1) {
                return true;
            }
        }
        return false;
    }

    //////////////////////////////////////////
    // EINDIGE RECHTE VERPLAATSINGEN        //
    // Bruikbaar voor KONING en PAKKEN PION //
    //////////////////////////////////////////

    /**
     * Verplaats 1 vakje naar rechts boven
     * 
     * @param beginx De Startcoordinaat x
     * @param beginy De Startcoordinaat y
     * @param eindx  De Nieuwe x-coordinaat
     * @param eindey De Nieuwe y-coordinaat
     */
    public boolean RechtsBoven(int beginx, int beginy, int eindx, int eindy) {
        if (beginx - 1 == eindx && beginy +1 == eindy) {
            if (eindx < 8 && eindx > -1 && eindy < 8 && eindy > -1) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verplaats 1 vakje naar links onder
     * 
     * @param beginx De Startcoordinaat x
     * @param beginy De Startcoordinaat y
     * @param eindx  De Nieuwe x-coordinaat
     * @param eindey De Nieuwe y-coordinaat
     */
    public boolean LinksOnder(int beginx, int beginy, int eindx, int eindy) {
        if (beginx + 1 == eindx && beginy - 1 == eindy) {
            if (eindx < 8 && eindx > -1 && eindy < 8 && eindy > -1) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verplaats 1 vakje naar links boven
     * 
     * @param beginx De Startcoordinaat x
     * @param beginy De Startcoordinaat y
     * @param eindx  De Nieuwe x-coordinaat
     * @param eindey De Nieuwe y-coordinaat
     */
    public boolean LinksBoven(int beginx, int beginy, int eindx, int eindy) {
        if (beginx - 1 == eindx && beginy - 1 == eindy) {
            if (eindx < 8 && eindx > -1 && eindy < 8 && eindy > -1) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verplaats 1 vakje naar rechts onder
     * 
     * @param beginx De Startcoordinaat x
     * @param beginy De Startcoordinaat y
     * @param eindx  De Nieuwe x-coordinaat
     * @param eindey De Nieuwe y-coordinaat
     */
    public boolean RechtsOnder(int beginx, int beginy, int eindx, int eindy) {
        if (beginx + 1 == eindx && beginy +1 == eindy) {
            if (eindx < 8 && eindx > -1 && eindy < 8 && eindy > -1) {
                return true;
            }
        }
        return false;
    }

    //////////////////////
    //UITZONDERING PION //
    //////////////////////
    
    /**
     * Verplaats witte pion 2 vakje
     * 
     * @param beginx De Startcoordinaat x
     * @param beginy De Startcoordinaat y
     * @param eindx  De Nieuwe x-coordinaat
     * @param eindey De Nieuwe y-coordinaat
     */
    public boolean Wit2(int beginx, int beginy, int eindx, int eindy) {
        if (beginx - 2 == eindx && beginy == eindy) {
            if (eindx < 8 && eindx > -1 && eindy < 8 && eindy > -1) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verplaats zwarte pion 2 vakje
     * 
     * @param beginx De Startcoordinaat x
     * @param beginy De Startcoordinaat y
     * @param eindx  De Nieuwe x-coordinaat
     * @param eindey De Nieuwe y-coordinaat
     */
    public boolean Zwart2(int beginx, int beginy, int eindx, int eindy) {
        if (beginx +2 == eindx && beginy == eindy) {
            if (eindx < 8 && eindx > -1 && eindy < 8 && eindy > -1) {
                return true;
            }
        }
        return false;
    }
    
    
    
    /////////////////////
    //BEWEGINGEN PAARD //
    /////////////////////
    
    
    /**
     * Verplaats 2 naar rechts en 1 naar boven
     * 
     * @param beginx De Startcoordinaat x
     * @param beginy De Startcoordinaat y
     * @param eindx  De Nieuwe x-coordinaat
     * @param eindey De Nieuwe y-coordinaat
     */
    public boolean RechtsUp(int beginx, int beginy, int eindx, int eindy) {
        if (beginx - 1 == eindx && beginy + 2 == eindy) {
            if (eindx < 8 && eindx > -1 && eindy < 8 && eindy > -1) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verplaats 2 naar rechts en 1 naar onder
     * 
     * @param beginx De Startcoordinaat x
     * @param beginy De Startcoordinaat y
     * @param eindx  De Nieuwe x-coordinaat
     * @param eindey De Nieuwe y-coordinaat
     */
    public boolean RechtsDown(int beginx, int beginy, int eindx, int eindy) {
        if (beginx + 1 == eindx && beginy + 2 == eindy) {
            if (eindx < 8 && eindx > -1 && eindy < 8 && eindy > -1) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verplaats 2 naar links en 1 naar boven
     * 
     * @param beginx De Startcoordinaat x
     * @param beginy De Startcoordinaat y
     * @param eindx  De Nieuwe x-coordinaat
     * @param eindey De Nieuwe y-coordinaat
     */
    public boolean LinksUp(int beginx, int beginy, int eindx, int eindy) {
        if (beginx - 1 == eindx && beginy - 2 == eindy) {
            if (eindx < 8 && eindx > -1 && eindy < 8 && eindy > -1) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verplaats 2 naar links en 1 naar onder
     * 
     * @param beginx De Startcoordinaat x
     * @param beginy De Startcoordinaat y
     * @param eindx  De Nieuwe x-coordinaat
     * @param eindey De Nieuwe y-coordinaat
     */
    public boolean LinksDown(int beginx, int beginy, int eindx, int eindy) {
        if (beginx + 1 == eindx && beginy - 2 == eindy) {
            if (eindx < 8 && eindx > -1 && eindy < 8 && eindy > -1) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verplaats 2 naar boven en 1 naar rechts
     * 
     * @param beginx De Startcoordinaat x
     * @param beginy De Startcoordinaat y
     * @param eindx  De Nieuwe x-coordinaat
     * @param eindey De Nieuwe y-coordinaat
     */
    public boolean BovenRight(int beginx, int beginy, int eindx, int eindy) {
        if (beginx - 2 == eindx && beginy +1 == eindy) {
            if (eindx < 8 && eindx > -1 && eindy < 8 && eindy > -1) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verplaats 2 naar boven en 1 naar links
     * 
     * @param beginx De Startcoordinaat x
     * @param beginy De Startcoordinaat y
     * @param eindx  De Nieuwe x-coordinaat
     * @param eindey De Nieuwe y-coordinaat
     */
    public boolean BovenLeft(int beginx, int beginy, int eindx, int eindy) {
        if (beginx - 2 == eindx && beginy - 1 == eindy) {
            if (eindx < 8 && eindx > -1 && eindy < 8 && eindy > -1) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verplaats 2 naar onder en 1 naar rechts
     * 
     * @param beginx De Startcoordinaat x
     * @param beginy De Startcoordinaat y
     * @param eindx  De Nieuwe x-coordinaat
     * @param eindey De Nieuwe y-coordinaat
     */
    public boolean OnderRight(int beginx, int beginy, int eindx, int eindy) {
        if (beginx +2 == eindx && beginy -+1 == eindy) {
            if (eindx < 8 && eindx > -1 && eindy < 8 && eindy > -1) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verplaats 2 naar onder en 1 naar links
     * 
     * @param beginx De Startcoordinaat x
     * @param beginy De Startcoordinaat y
     * @param eindx  De Nieuwe x-coordinaat
     * @param eindey De Nieuwe y-coordinaat
     */
    public boolean OnderLeft(int beginx, int beginy, int eindx, int eindy) {
        if (beginx +2 == eindx && beginy - 1 == eindy) {
            if (eindx < 8 && eindx > -1 && eindy < 8 && eindy > -1) {
                return true;
            }
        }
        return false;
    }
}