package net.irext.webapi.utils;

/**
 * Filename:       Constants.java
 * Revised:        Date: 2017-04-03
 * Revision:       Revision: 1.0
 * <p>
 * Description:    SDK Constants
 * <p>
 * Revision log:
 * 2017-04-03: created by strawmanbobi
 */
public class Constants {

    /**
     * Default constructor for Constants.
     */
    public Constants() {
        // Private constructor to prevent instantiation
    }

    /**
     * Error code indicating successful operation.
     */
    public static final int ERROR_CODE_SUCCESS = 0;
    
    /**
     * Error code indicating network error.
     */
    public static final int ERROR_CODE_NETWORK_ERROR = -1;
    
    /**
     * Error code indicating authentication failure.
     */
    public static final int ERROR_CODE_AUTH_FAILURE = 1;
    
    /**
     * Error code indicating invalid category.
     */
    public static final int ERROR_CODE_INVALID_CATEGORY = 2;
    
    /**
     * Error code indicating invalid brand.
     */
    public static final int ERROR_CODE_INVALID_BRAND = 3;
    
    /**
     * Error code indicating invalid parameter.
     */
    public static final int ERROR_CODE_INVALID_PARAMETER = 4;

    /**
     * Enumeration of category IDs.
     */
    public enum CategoryID {
        /** Air conditioner category ID. */
        AIR_CONDITIONER(1),
        /** TV category ID. */
        TV(2),
        /** Set-top box category ID. */
        STB(3),
        /** Network box category ID. */
        NET_BOX(4),
        /** IPTV category ID. */
        IPTV(5),
        /** DVD category ID. */
        DVD(6),
        /** Fan category ID. */
        FAN(7),
        /** Projector category ID. */
        PROJECTOR(8),
        /** Stereo category ID. */
        STEREO(9),
        /** Light category ID. */
        LIGHT(10),
        /** BSTB category ID. */
        BSTB(11),
        /** Cleaning robot category ID. */
        CLEANING_ROBOT(12),
        /** Air cleaner category ID. */
        AIR_CLEANER(13),
        /** Dyson category ID. */
        DYSON(14);

        private final int id;

        /**
         * Constructs a CategoryID with the specified ID.
         *
         * @param id the category ID
         */
        CategoryID(int id) {
            this.id = id;
        }

        /**
         * Gets the category ID value.
         *
         * @return the category ID value
         */
        public int getValue() {
            return id;
        }
    }

    /**
     * Enumeration of binary types.
     */
    public enum BinaryType {
        /** Binary type. */
        TYPE_BINARY(0),
        /** Hexadecimal type. */
        TYPE_HEXDECIMAL(1);

        private final int type;

        /**
         * Constructs a BinaryType with the specified type.
         *
         * @param type the binary type
         */
        BinaryType(int type) {
            this.type = type;
        }

        /**
         * Gets the binary type value.
         *
         * @return the binary type value
         */
        public int getValue() {
            return type;
        }
    }

    /**
     * Enumeration of AC power states.
     */
    public enum ACPower {
        /** AC power on state. */
        POWER_ON(0),
        /** AC power off state. */
        POWER_OFF(1);

        private final int power;

        /**
         * Constructs an ACPower with the specified power state.
         *
         * @param power the power state
         */
        ACPower(int power) {
            this.power = power;
        }

        /**
         * Gets the power state value.
         *
         * @return the power state value
         */
        public int getValue() {
            return power;
        }
    }

    /**
     * Enumeration of AC modes.
     */
    public enum ACMode {
        /** Cool mode. */
        MODE_COOL(0),
        /** Heat mode. */
        MODE_HEAT(1),
        /** Auto mode. */
        MODE_AUTO(2),
        /** Fan mode. */
        MODE_FAN(3),
        /** Dehumidify mode. */
        MODE_DEHUMIDITY(4);

        private final int mode;

        /**
         * Constructs an ACMode with the specified mode.
         *
         * @param mode the AC mode
         */
        ACMode(int mode) {
            this.mode = mode;
        }

        /**
         * Gets the mode value.
         *
         * @return the mode value
         */
        public int getValue() {
            return mode;
        }
    }

    /**
     * Enumeration of AC temperatures.
     */
    public enum ACTemperature {
        /** Temperature 16 degrees. */
        TEMP_16(0),
        /** Temperature 17 degrees. */
        TEMP_17(1),
        /** Temperature 18 degrees. */
        TEMP_18(2),
        /** Temperature 19 degrees. */
        TEMP_19(3),
        /** Temperature 20 degrees. */
        TEMP_20(4),
        /** Temperature 21 degrees. */
        TEMP_21(5),
        /** Temperature 22 degrees. */
        TEMP_22(6),
        /** Temperature 23 degrees. */
        TEMP_23(7),
        /** Temperature 24 degrees. */
        TEMP_24(8),
        /** Temperature 25 degrees. */
        TEMP_25(9),
        /** Temperature 26 degrees. */
        TEMP_26(10),
        /** Temperature 27 degrees. */
        TEMP_27(11),
        /** Temperature 28 degrees. */
        TEMP_28(12),
        /** Temperature 29 degrees. */
        TEMP_29(13),
        /** Temperature 30 degrees. */
        TEMP_30(14);

        private final int temp;

        /**
         * Constructs an ACTemperature with the specified temperature.
         *
         * @param temp the temperature value
         */
        ACTemperature(int temp) {
            this.temp = temp;
        }

        /**
         * Gets the temperature value.
         *
         * @return the temperature value
         */
        public int getValue() {
            return temp;
        }
    }

    /**
     * Enumeration of AC wind speeds.
     */
    public enum ACWindSpeed {
        /** Auto wind speed. */
        SPEED_AUTO(0),
        /** Low wind speed. */
        SPEED_LOW(1),
        /** Medium wind speed. */
        SPEED_MEDIUM(2),
        /** High wind speed. */
        SPEED_HIGH(3);

        private final int speed;

        /**
         * Constructs an ACWindSpeed with the specified speed.
         *
         * @param speed the wind speed
         */
        ACWindSpeed(int speed) {
            this.speed = speed;
        }

        /**
         * Gets the wind speed value.
         *
         * @return the wind speed value
         */
        public int getValue() {
            return speed;
        }
    }

    /**
     * Enumeration of AC swing modes.
     */
    public enum ACSwing {
        /** Swing on mode. */
        SWING_ON(0),
        /** Swing off mode. */
        SWING_OFF(1);

        private final int swing;

        /**
         * Constructs an ACSwing with the specified swing mode.
         *
         * @param swing the swing mode
         */
        ACSwing(int swing) {
            this.swing = swing;
        }

        /**
         * Gets the swing mode value.
         *
         * @return the swing mode value
         */
        public int getValue() {
            return swing;
        }
    }

    /**
     * Enumeration of AC functions.
     */
    public enum ACFunction {
        /** Function to switch power. */
        FUNCTION_SWITCH_POWER(1),
        /** Function to change mode. */
        FUNCTION_CHANGE_MODE(2),
        /** Function to increase temperature. */
        FUNCTION_TEMPERATURE_UP(3),
        /** Function to decrease temperature. */
        FUNCTION_TEMPERATURE_DOWN(4),
        /** Function to switch wind speed. */
        FUNCTION_SWITCH_WIND_SPEED(5),
        /** Function to switch wind direction. */
        FUNCTION_SWITCH_WIND_DIR(6),
        /** Function to switch swing mode. */
        FUNCTION_SWITCH_SWING(7);

        private final int function;

        /**
         * Constructs an ACFunction with the specified function.
         *
         * @param function the function value
         */
        ACFunction(int function) {
            this.function = function;
        }

        /**
         * Gets the function value.
         *
         * @return the function value
         */
        public int getValue() {
            return function;
        }
    }
}