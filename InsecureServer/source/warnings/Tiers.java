package warnings;


/**
 * Enumeration for levels of reaction.
 *
 * @author Andy Shaw
 */
public enum Tiers:
{
    TIER1(Responses.ALARM),
    TIER2(Responses.CAMERA, Responses.ALARM, Responses.MICROPHONE),
    TIER3(Responses.CAMERA, Responses.ALARM, Responses.MICROPHONE, Responses.TEXT_SECONDARY)
    TIER4(Responses.LAUNCH_MISSILE_TO_LOCATION)
}