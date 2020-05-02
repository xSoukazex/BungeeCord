package net.md_5.bungee.protocol;

import java.util.Arrays;
import java.util.List;

public class ProtocolConstants
{

    public static final int MINECRAFT_1_13 = 393;
    public static final int MINECRAFT_1_13_1 = 401;
    public static final int MINECRAFT_1_13_2 = 404;
    public static final int MINECRAFT_1_14 = 477;
    public static final int MINECRAFT_1_14_1 = 480;
    public static final int MINECRAFT_1_14_2 = 485;
    public static final int MINECRAFT_1_14_3 = 490;
    public static final int MINECRAFT_1_14_4 = 498;
    public static final int MINECRAFT_1_15 = 573;
    public static final int MINECRAFT_1_15_1 = 575;
    public static final int MINECRAFT_1_15_2 = 578;
    public static final List<String> SUPPORTED_VERSIONS = Arrays.asList(
            "1.13.x",
            "1.14.x",
            "1.15.x"
    );
    public static final List<Integer> SUPPORTED_VERSION_IDS = Arrays.asList(
            ProtocolConstants.MINECRAFT_1_13,
            ProtocolConstants.MINECRAFT_1_13_1,
            ProtocolConstants.MINECRAFT_1_13_2,
            ProtocolConstants.MINECRAFT_1_14,
            ProtocolConstants.MINECRAFT_1_14_1,
            ProtocolConstants.MINECRAFT_1_14_2,
            ProtocolConstants.MINECRAFT_1_14_3,
            ProtocolConstants.MINECRAFT_1_14_4,
            ProtocolConstants.MINECRAFT_1_15,
            ProtocolConstants.MINECRAFT_1_15_1,
            ProtocolConstants.MINECRAFT_1_15_2
    );

    public enum Direction
    {

        TO_CLIENT, TO_SERVER;
    }
}
