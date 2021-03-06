package per.goweii.wanandroid.utils.ad;

import per.goweii.wanandroid.common.Config;
import per.goweii.wanandroid.utils.cdkey.CDKeyUtils;

/**
 * @author CuiZhen
 * @date 2020/2/15
 * QQ: 302833254
 * E-mail: goweii@163.com
 * GitHub: https://github.com/goweii
 */
class AdUtils {
    static boolean isShowAd() {
        return Config.SHOW_AD && !CDKeyUtils.getInstance().isActivated();
    }
}
