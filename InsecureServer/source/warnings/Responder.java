package warnings;


    /**
     * Responder class to process the warning from the fencing algorithm and create a response
     * level to be sent to the phone.
     *     
     * @author Andy Shaw
     * @author Jeff Schobelock
     */
public class Responder
{
    /**
     * Create a response based on the rawWarning sent in.  This will be a warning percentage
     * so it will be rawWarning/100.
     * 0  < warning <= .30 -> respond with a tier 1 warning
     * .3 < warning <= .70 -> respond with a tier 2 warning
     * .7 < warning respond with a tier 3 warning
     *
     * @param rawWarning Raw warning level
     * @return Level of warning to execute.
     */
     public static createResponse(double rawWarning)
     {
        // convert to percentage
        double risk = rawWarning / 100;
        
        // create warning level
        if(x > 0 && x <= .30)
        {
            return Tiers.TIER1;
        }
        else if(x > .3 && x <= .7)
        {
            return Tiers.TIER2;
        }
        else if(x > .7)
        {
            return Tiers.TIER3;
        }
     }
}