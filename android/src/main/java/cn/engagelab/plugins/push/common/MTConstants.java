package cn.engagelab.plugins.push.common;

public class MTConstants {

    public static final String DEBUG = "debug";

    public static final String REGISTRATION_ID = "registerID";

    public static final String CODE = "code";
    public static final String CHANNEL = "channel";
    public static final String SEQUENCE = "sequence";
    public static final String CONNECT_ENABLE = "connectEnable";
    //电话号码
    public static final String MOBILE_NUMBER = "mobileNumber";
    //pushTime
    public static final String PUSH_TIME_DAYS = "pushTimeDays";
    public static final String PUSH_TIME_START_HOUR = "pushTimeStartHour";
    public static final String PUSH_TIME_END_HOUR = "pushTimeEndHour";
    //silenceTime
    public static final String SILENCE_TIME_START_HOUR = "silenceTimeStartHour";
    public static final String SILENCE_TIME_START_MINUTE = "silenceTimeStartMinute";
    public static final String SILENCE_TIME_END_HOUR = "silenceTimeEndHour";
    public static final String SILENCE_TIME_END_MINUTE = "silenceTimeEndMinute";
    //消息
    public static final String MESSAGE_ID = "messageID";
    public static final String TITLE = "title";
    public static final String CONTENT = "content";
    public static final String EXTRAS = "extras";
    public static final String CLICK = "clickAction";
    public static final String TARGET = "target";
    //消息事件
    public static final String NOTIFICATION_ARRIVED = "notificationArrived";
    public static final String NOTIFICATION_OPENED = "notificationOpened";
    public static final String NOTIFICATION_DISMISSED = "notificationDismissed";
    //通知消息
    public static final String NOTIFICATION_EVENT_TYPE = "notificationEventType";
    public static final String NOTIFICATION_MAX_NUMBER = "notificationMaxNumber";
    public static final String NOTIFICATION_ID = "notificationId";
    public static final String INAPP_ARRIVED = "inappShow";
    public static final String INAPP_OPENED = "inappClick";
    public static final String INAPP_EVENT_TYPE = "inappEventType";
    //cmd消息
    public static final String COMMAND = "command";
    public static final String COMMAND_EXTRA = "commandExtra";
    public static final String COMMAND_RESULT = "commandResult";
    public static final String COMMAND_MESSAGE = "commandMessage";
    //地理围栏
    public static final String GEO_FENCE_ID = "geoFenceID";
    public static final String GEO_FENCE_INTERVAL = "geoFenceInterval";
    public static final String GEO_FENCE_MAX_NUMBER = "geoFenceMaxNumber";
    //tag alias
    public static final String TAG = "tag";
    public static final String TAGS = "tags";
    public static final String ALIAS = "alias";
    public static final String TAG_ENABLE = "tagEnable";

    public static final String PLATFORM = "platform";
    public static final String TOKEN = "token";
    public static final String REGION = "region";
    public static final String APPKEY = "appkey";

    //error
    public static final String PARAMS_NULL = "params cant be null";
    public static final String PARAMS_ILLEGAL = "params illegal";
    public static final String CALLBACK_NULL = "callback cant be null";
    //event
    public static final String CONNECT_EVENT = "ConnectEvent";
    public static final String NOTIFICATION_EVENT = "NotificationEvent";
    public static final String INAPPMESSAGE_EVENT = "InappMessageEvent";

    public static final String PLATFORM_TOKEN_EVENT = "PlatformTokenEvent";
    public static final String CUSTOM_MESSAGE_EVENT = "CustomMessageEvent";
    public static final String LOCAL_NOTIFICATION_EVENT = "LocalNotificationEvent";
    public static final String TAG_ALIAS_EVENT = "TagAliasEvent";
    public static final String MOBILE_NUMBER_EVENT = "MobileNumberEvent";
    public static final String COMMAND_EVENT = "CommandEvent";
    public static final String BADGE_NUMBER = "appBadge";
    public static final String PROPERTIES = "pros";
}
