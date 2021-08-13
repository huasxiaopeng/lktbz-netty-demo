package lktbz.netty.demo.config;

/**
 * @author lktbz
 * @version 1.0.0
 * @date 2021/8/13
 * @desc
 */
public class MsgUtil {
    public static MsgInfo buildMsg(String channelId, String msgContent) {
        return new MsgInfo(channelId,msgContent);
    }

}
