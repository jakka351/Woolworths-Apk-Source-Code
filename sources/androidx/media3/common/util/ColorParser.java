package androidx.media3.common.util;

import android.graphics.Color;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@UnstableApi
/* loaded from: classes2.dex */
public final class ColorParser {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f2908a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    public static final Pattern b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    public static final Pattern c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
    public static final HashMap d;

    static {
        HashMap map = new HashMap();
        d = map;
        androidx.constraintlayout.core.state.a.u(-984833, map, "aliceblue", -332841, "antiquewhite");
        androidx.compose.ui.input.pointer.a.x(map, "aqua", -16711681, -8388652, "aquamarine");
        androidx.constraintlayout.core.state.a.u(-983041, map, "azure", -657956, "beige");
        androidx.constraintlayout.core.state.a.u(-6972, map, "bisque", -16777216, "black");
        androidx.constraintlayout.core.state.a.u(-5171, map, "blanchedalmond", -16776961, "blue");
        androidx.constraintlayout.core.state.a.u(-7722014, map, "blueviolet", -5952982, "brown");
        androidx.constraintlayout.core.state.a.u(-2180985, map, "burlywood", -10510688, "cadetblue");
        androidx.constraintlayout.core.state.a.u(-8388864, map, "chartreuse", -2987746, "chocolate");
        androidx.constraintlayout.core.state.a.u(-32944, map, "coral", -10185235, "cornflowerblue");
        androidx.constraintlayout.core.state.a.u(-1828, map, "cornsilk", -2354116, "crimson");
        androidx.compose.ui.input.pointer.a.x(map, "cyan", -16711681, -16777077, "darkblue");
        androidx.constraintlayout.core.state.a.u(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        androidx.compose.ui.input.pointer.a.x(map, "darkgray", -5658199, -16751616, "darkgreen");
        androidx.compose.ui.input.pointer.a.x(map, "darkgrey", -5658199, -4343957, "darkkhaki");
        androidx.constraintlayout.core.state.a.u(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        androidx.constraintlayout.core.state.a.u(-29696, map, "darkorange", -6737204, "darkorchid");
        androidx.constraintlayout.core.state.a.u(-7667712, map, "darkred", -1468806, "darksalmon");
        androidx.constraintlayout.core.state.a.u(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        androidx.compose.ui.input.pointer.a.x(map, "darkturquoise", -16724271, -7077677, "darkviolet");
        androidx.constraintlayout.core.state.a.u(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        androidx.compose.ui.input.pointer.a.x(map, "dodgerblue", -14774017, -5103070, "firebrick");
        androidx.constraintlayout.core.state.a.u(-1296, map, "floralwhite", -14513374, "forestgreen");
        androidx.compose.ui.input.pointer.a.x(map, "fuchsia", -65281, -2302756, "gainsboro");
        androidx.constraintlayout.core.state.a.u(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        androidx.constraintlayout.core.state.a.u(-16744448, map, "green", -5374161, "greenyellow");
        androidx.compose.ui.input.pointer.a.x(map, "grey", -8355712, -983056, "honeydew");
        androidx.constraintlayout.core.state.a.u(-38476, map, "hotpink", -3318692, "indianred");
        androidx.constraintlayout.core.state.a.u(-11861886, map, "indigo", -16, "ivory");
        androidx.constraintlayout.core.state.a.u(-989556, map, "khaki", -1644806, "lavender");
        androidx.constraintlayout.core.state.a.u(-3851, map, "lavenderblush", -8586240, "lawngreen");
        androidx.constraintlayout.core.state.a.u(-1331, map, "lemonchiffon", -5383962, "lightblue");
        androidx.constraintlayout.core.state.a.u(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        androidx.constraintlayout.core.state.a.u(-18751, map, "lightpink", -24454, "lightsalmon");
        androidx.constraintlayout.core.state.a.u(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        androidx.compose.ui.input.pointer.a.x(map, "lightsteelblue", -5192482, -32, "lightyellow");
        androidx.constraintlayout.core.state.a.u(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        androidx.constraintlayout.core.state.a.u(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        androidx.constraintlayout.core.state.a.u(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        androidx.constraintlayout.core.state.a.u(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        androidx.constraintlayout.core.state.a.u(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        androidx.constraintlayout.core.state.a.u(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        androidx.constraintlayout.core.state.a.u(-15132304, map, "midnightblue", -655366, "mintcream");
        androidx.constraintlayout.core.state.a.u(-6943, map, "mistyrose", -6987, "moccasin");
        androidx.constraintlayout.core.state.a.u(-8531, map, "navajowhite", -16777088, "navy");
        androidx.constraintlayout.core.state.a.u(-133658, map, "oldlace", -8355840, "olive");
        androidx.constraintlayout.core.state.a.u(-9728477, map, "olivedrab", -23296, "orange");
        androidx.constraintlayout.core.state.a.u(-47872, map, "orangered", -2461482, "orchid");
        androidx.constraintlayout.core.state.a.u(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        androidx.constraintlayout.core.state.a.u(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        androidx.constraintlayout.core.state.a.u(-4139, map, "papayawhip", -9543, "peachpuff");
        androidx.constraintlayout.core.state.a.u(-3308225, map, "peru", -16181, "pink");
        androidx.constraintlayout.core.state.a.u(-2252579, map, "plum", -5185306, "powderblue");
        androidx.constraintlayout.core.state.a.u(-8388480, map, "purple", -10079335, "rebeccapurple");
        androidx.constraintlayout.core.state.a.u(-65536, map, "red", -4419697, "rosybrown");
        androidx.constraintlayout.core.state.a.u(-12490271, map, "royalblue", -7650029, "saddlebrown");
        androidx.constraintlayout.core.state.a.u(-360334, map, "salmon", -744352, "sandybrown");
        androidx.constraintlayout.core.state.a.u(-13726889, map, "seagreen", -2578, "seashell");
        androidx.constraintlayout.core.state.a.u(-6270419, map, "sienna", -4144960, "silver");
        androidx.constraintlayout.core.state.a.u(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        androidx.compose.ui.input.pointer.a.x(map, "snow", -1286, -16711809, "springgreen");
        androidx.constraintlayout.core.state.a.u(-12156236, map, "steelblue", -2968436, "tan");
        androidx.constraintlayout.core.state.a.u(-16744320, map, "teal", -2572328, "thistle");
        androidx.constraintlayout.core.state.a.u(-40121, map, "tomato", 0, "transparent");
        androidx.constraintlayout.core.state.a.u(-12525360, map, "turquoise", -1146130, "violet");
        androidx.constraintlayout.core.state.a.u(-663885, map, "wheat", -1, "white");
        androidx.constraintlayout.core.state.a.u(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    public static int a(String str, boolean z) throws NumberFormatException {
        int i;
        Assertions.b(!TextUtils.isEmpty(str));
        String strReplace = str.replace(" ", "");
        if (strReplace.charAt(0) == '#') {
            int i2 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i2;
            }
            if (strReplace.length() == 9) {
                return ((i2 & 255) << 24) | (i2 >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z ? c : b).matcher(strReplace);
            if (matcher.matches()) {
                if (z) {
                    String strGroup = matcher.group(4);
                    strGroup.getClass();
                    i = (int) (Float.parseFloat(strGroup) * 255.0f);
                } else {
                    String strGroup2 = matcher.group(4);
                    strGroup2.getClass();
                    i = Integer.parseInt(strGroup2, 10);
                }
                String strGroup3 = matcher.group(1);
                strGroup3.getClass();
                int i3 = Integer.parseInt(strGroup3, 10);
                String strGroup4 = matcher.group(2);
                strGroup4.getClass();
                int i4 = Integer.parseInt(strGroup4, 10);
                String strGroup5 = matcher.group(3);
                strGroup5.getClass();
                return Color.argb(i, i3, i4, Integer.parseInt(strGroup5, 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = f2908a.matcher(strReplace);
            if (matcher2.matches()) {
                String strGroup6 = matcher2.group(1);
                strGroup6.getClass();
                int i5 = Integer.parseInt(strGroup6, 10);
                String strGroup7 = matcher2.group(2);
                strGroup7.getClass();
                int i6 = Integer.parseInt(strGroup7, 10);
                String strGroup8 = matcher2.group(3);
                strGroup8.getClass();
                return Color.rgb(i5, i6, Integer.parseInt(strGroup8, 10));
            }
        } else {
            Integer num = (Integer) d.get(Ascii.b(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }
}
