package com.caverock.androidsvg;

import android.graphics.Matrix;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.core.state.a;
import com.caverock.androidsvg.CSSParser;
import com.caverock.androidsvg.PreserveAspectRatio;
import com.caverock.androidsvg.SVG;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlnlnnn;
import com.scandit.datacapture.core.source.CameraSettings;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.bouncycastle.i18n.TextBundle;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
class SVGParser {
    public int d;

    /* renamed from: a, reason: collision with root package name */
    public SVG f14029a = null;
    public SVG.SvgContainer b = null;
    public boolean c = false;
    public boolean e = false;
    public SVGElem f = null;
    public StringBuilder g = null;
    public boolean h = false;
    public StringBuilder i = null;

    /* renamed from: com.caverock.androidsvg.SVGParser$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14030a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[SVGAttr.values().length];
            b = iArr;
            try {
                SVGAttr sVGAttr = SVGAttr.d;
                iArr[82] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = b;
                SVGAttr sVGAttr2 = SVGAttr.d;
                iArr2[83] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = b;
                SVGAttr sVGAttr3 = SVGAttr.d;
                iArr3[81] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = b;
                SVGAttr sVGAttr4 = SVGAttr.d;
                iArr4[25] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = b;
                SVGAttr sVGAttr5 = SVGAttr.d;
                iArr5[79] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int[] iArr6 = b;
                SVGAttr sVGAttr6 = SVGAttr.d;
                iArr6[26] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                int[] iArr7 = b;
                SVGAttr sVGAttr7 = SVGAttr.d;
                iArr7[48] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                int[] iArr8 = b;
                SVGAttr sVGAttr8 = SVGAttr.d;
                iArr8[13] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                int[] iArr9 = b;
                SVGAttr sVGAttr9 = SVGAttr.d;
                iArr9[43] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                int[] iArr10 = b;
                SVGAttr sVGAttr10 = SVGAttr.d;
                iArr10[56] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                int[] iArr11 = b;
                SVGAttr sVGAttr11 = SVGAttr.d;
                iArr11[57] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                int[] iArr12 = b;
                SVGAttr sVGAttr12 = SVGAttr.d;
                iArr12[6] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                int[] iArr13 = b;
                SVGAttr sVGAttr13 = SVGAttr.d;
                iArr13[7] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                int[] iArr14 = b;
                SVGAttr sVGAttr14 = SVGAttr.d;
                iArr14[49] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                int[] iArr15 = b;
                SVGAttr sVGAttr15 = SVGAttr.d;
                iArr15[84] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                int[] iArr16 = b;
                SVGAttr sVGAttr16 = SVGAttr.d;
                iArr16[85] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                int[] iArr17 = b;
                SVGAttr sVGAttr17 = SVGAttr.d;
                iArr17[86] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                int[] iArr18 = b;
                SVGAttr sVGAttr18 = SVGAttr.d;
                iArr18[87] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                int[] iArr19 = b;
                SVGAttr sVGAttr19 = SVGAttr.d;
                iArr19[9] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                int[] iArr20 = b;
                SVGAttr sVGAttr20 = SVGAttr.d;
                iArr20[10] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                int[] iArr21 = b;
                SVGAttr sVGAttr21 = SVGAttr.d;
                iArr21[52] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                int[] iArr22 = b;
                SVGAttr sVGAttr22 = SVGAttr.d;
                iArr22[53] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                int[] iArr23 = b;
                SVGAttr sVGAttr23 = SVGAttr.d;
                iArr23[73] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                int[] iArr24 = b;
                SVGAttr sVGAttr24 = SVGAttr.d;
                iArr24[54] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                int[] iArr25 = b;
                SVGAttr sVGAttr25 = SVGAttr.d;
                iArr25[55] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                int[] iArr26 = b;
                SVGAttr sVGAttr26 = SVGAttr.d;
                iArr26[50] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                int[] iArr27 = b;
                SVGAttr sVGAttr27 = SVGAttr.d;
                iArr27[51] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                int[] iArr28 = b;
                SVGAttr sVGAttr28 = SVGAttr.d;
                iArr28[34] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                int[] iArr29 = b;
                SVGAttr sVGAttr29 = SVGAttr.d;
                iArr29[32] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                int[] iArr30 = b;
                SVGAttr sVGAttr30 = SVGAttr.d;
                iArr30[33] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                int[] iArr31 = b;
                SVGAttr sVGAttr31 = SVGAttr.d;
                iArr31[41] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                int[] iArr32 = b;
                SVGAttr sVGAttr32 = SVGAttr.d;
                iArr32[24] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                int[] iArr33 = b;
                SVGAttr sVGAttr33 = SVGAttr.d;
                iArr33[23] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                int[] iArr34 = b;
                SVGAttr sVGAttr34 = SVGAttr.d;
                iArr34[60] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                int[] iArr35 = b;
                SVGAttr sVGAttr35 = SVGAttr.d;
                iArr35[11] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                int[] iArr36 = b;
                SVGAttr sVGAttr36 = SVGAttr.d;
                iArr36[12] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                int[] iArr37 = b;
                SVGAttr sVGAttr37 = SVGAttr.d;
                iArr37[39] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                int[] iArr38 = b;
                SVGAttr sVGAttr38 = SVGAttr.d;
                iArr38[3] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                int[] iArr39 = b;
                SVGAttr sVGAttr39 = SVGAttr.d;
                iArr39[61] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                int[] iArr40 = b;
                SVGAttr sVGAttr40 = SVGAttr.d;
                iArr40[46] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                int[] iArr41 = b;
                SVGAttr sVGAttr41 = SVGAttr.d;
                iArr41[44] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                int[] iArr42 = b;
                SVGAttr sVGAttr42 = SVGAttr.d;
                iArr42[45] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                int[] iArr43 = b;
                SVGAttr sVGAttr43 = SVGAttr.d;
                iArr43[37] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                int[] iArr44 = b;
                SVGAttr sVGAttr44 = SVGAttr.d;
                iArr44[36] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                int[] iArr45 = b;
                SVGAttr sVGAttr45 = SVGAttr.d;
                iArr45[72] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                int[] iArr46 = b;
                SVGAttr sVGAttr46 = SVGAttr.d;
                iArr46[0] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                int[] iArr47 = b;
                SVGAttr sVGAttr47 = SVGAttr.d;
                iArr47[15] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                int[] iArr48 = b;
                SVGAttr sVGAttr48 = SVGAttr.d;
                iArr48[16] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                int[] iArr49 = b;
                SVGAttr sVGAttr49 = SVGAttr.d;
                iArr49[17] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                int[] iArr50 = b;
                SVGAttr sVGAttr50 = SVGAttr.d;
                iArr50[64] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                int[] iArr51 = b;
                SVGAttr sVGAttr51 = SVGAttr.d;
                iArr51[70] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                int[] iArr52 = b;
                SVGAttr sVGAttr52 = SVGAttr.d;
                iArr52[71] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                int[] iArr53 = b;
                SVGAttr sVGAttr53 = SVGAttr.d;
                iArr53[67] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                int[] iArr54 = b;
                SVGAttr sVGAttr54 = SVGAttr.d;
                iArr54[68] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                int[] iArr55 = b;
                SVGAttr sVGAttr55 = SVGAttr.d;
                iArr55[69] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                int[] iArr56 = b;
                SVGAttr sVGAttr56 = SVGAttr.d;
                iArr56[65] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                int[] iArr57 = b;
                SVGAttr sVGAttr57 = SVGAttr.d;
                iArr57[66] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                int[] iArr58 = b;
                SVGAttr sVGAttr58 = SVGAttr.d;
                iArr58[40] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                int[] iArr59 = b;
                SVGAttr sVGAttr59 = SVGAttr.d;
                iArr59[5] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                int[] iArr60 = b;
                SVGAttr sVGAttr60 = SVGAttr.d;
                iArr60[18] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                int[] iArr61 = b;
                SVGAttr sVGAttr61 = SVGAttr.d;
                iArr61[19] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                int[] iArr62 = b;
                SVGAttr sVGAttr62 = SVGAttr.d;
                iArr62[20] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                int[] iArr63 = b;
                SVGAttr sVGAttr63 = SVGAttr.d;
                iArr63[21] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                int[] iArr64 = b;
                SVGAttr sVGAttr64 = SVGAttr.d;
                iArr64[22] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                int[] iArr65 = b;
                SVGAttr sVGAttr65 = SVGAttr.d;
                iArr65[75] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                int[] iArr66 = b;
                SVGAttr sVGAttr66 = SVGAttr.d;
                iArr66[8] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                int[] iArr67 = b;
                SVGAttr sVGAttr67 = SVGAttr.d;
                iArr67[74] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                int[] iArr68 = b;
                SVGAttr sVGAttr68 = SVGAttr.d;
                iArr68[42] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                int[] iArr69 = b;
                SVGAttr sVGAttr69 = SVGAttr.d;
                iArr69[28] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                int[] iArr70 = b;
                SVGAttr sVGAttr70 = SVGAttr.d;
                iArr70[29] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                int[] iArr71 = b;
                SVGAttr sVGAttr71 = SVGAttr.d;
                iArr71[30] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                int[] iArr72 = b;
                SVGAttr sVGAttr72 = SVGAttr.d;
                iArr72[31] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                int[] iArr73 = b;
                SVGAttr sVGAttr73 = SVGAttr.d;
                iArr73[14] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                int[] iArr74 = b;
                SVGAttr sVGAttr74 = SVGAttr.d;
                iArr74[90] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                int[] iArr75 = b;
                SVGAttr sVGAttr75 = SVGAttr.d;
                iArr75[62] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                int[] iArr76 = b;
                SVGAttr sVGAttr76 = SVGAttr.d;
                iArr76[63] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                int[] iArr77 = b;
                SVGAttr sVGAttr77 = SVGAttr.d;
                iArr77[1] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                int[] iArr78 = b;
                SVGAttr sVGAttr78 = SVGAttr.d;
                iArr78[2] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                int[] iArr79 = b;
                SVGAttr sVGAttr79 = SVGAttr.d;
                iArr79[4] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                int[] iArr80 = b;
                SVGAttr sVGAttr80 = SVGAttr.d;
                iArr80[35] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                int[] iArr81 = b;
                SVGAttr sVGAttr81 = SVGAttr.d;
                iArr81[58] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                int[] iArr82 = b;
                SVGAttr sVGAttr82 = SVGAttr.d;
                iArr82[59] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                int[] iArr83 = b;
                SVGAttr sVGAttr83 = SVGAttr.d;
                iArr83[88] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                int[] iArr84 = b;
                SVGAttr sVGAttr84 = SVGAttr.d;
                iArr84[89] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                int[] iArr85 = b;
                SVGAttr sVGAttr85 = SVGAttr.d;
                iArr85[78] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                int[] iArr86 = b;
                SVGAttr sVGAttr86 = SVGAttr.d;
                iArr86[27] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                int[] iArr87 = b;
                SVGAttr sVGAttr87 = SVGAttr.d;
                iArr87[80] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                int[] iArr88 = b;
                SVGAttr sVGAttr88 = SVGAttr.d;
                iArr88[77] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                int[] iArr89 = b;
                SVGAttr sVGAttr89 = SVGAttr.d;
                iArr89[38] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            int[] iArr90 = new int[SVGElem.values().length];
            f14030a = iArr90;
            try {
                SVGElem sVGElem = SVGElem.d;
                iArr90[0] = 1;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                int[] iArr91 = f14030a;
                SVGElem sVGElem2 = SVGElem.d;
                iArr91[7] = 2;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                int[] iArr92 = f14030a;
                SVGElem sVGElem3 = SVGElem.d;
                iArr92[1] = 3;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                int[] iArr93 = f14030a;
                SVGElem sVGElem4 = SVGElem.d;
                iArr93[4] = 4;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                int[] iArr94 = f14030a;
                SVGElem sVGElem5 = SVGElem.d;
                iArr94[29] = 5;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                int[] iArr95 = f14030a;
                SVGElem sVGElem6 = SVGElem.d;
                iArr95[13] = 6;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                int[] iArr96 = f14030a;
                SVGElem sVGElem7 = SVGElem.d;
                iArr96[18] = 7;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                int[] iArr97 = f14030a;
                SVGElem sVGElem8 = SVGElem.d;
                iArr97[2] = 8;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                int[] iArr98 = f14030a;
                SVGElem sVGElem9 = SVGElem.d;
                iArr98[6] = 9;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                int[] iArr99 = f14030a;
                SVGElem sVGElem10 = SVGElem.d;
                iArr99[9] = 10;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                int[] iArr100 = f14030a;
                SVGElem sVGElem11 = SVGElem.d;
                iArr100[16] = 11;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                int[] iArr101 = f14030a;
                SVGElem sVGElem12 = SVGElem.d;
                iArr101[15] = 12;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                int[] iArr102 = f14030a;
                SVGElem sVGElem13 = SVGElem.d;
                iArr102[24] = 13;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                int[] iArr103 = f14030a;
                SVGElem sVGElem14 = SVGElem.d;
                iArr103[28] = 14;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                int[] iArr104 = f14030a;
                SVGElem sVGElem15 = SVGElem.d;
                iArr104[27] = 15;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                int[] iArr105 = f14030a;
                SVGElem sVGElem16 = SVGElem.d;
                iArr105[22] = 16;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                int[] iArr106 = f14030a;
                SVGElem sVGElem17 = SVGElem.d;
                iArr106[23] = 17;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                int[] iArr107 = f14030a;
                SVGElem sVGElem18 = SVGElem.d;
                iArr107[11] = 18;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                int[] iArr108 = f14030a;
                SVGElem sVGElem19 = SVGElem.d;
                iArr108[10] = 19;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                int[] iArr109 = f14030a;
                SVGElem sVGElem20 = SVGElem.d;
                iArr109[17] = 20;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                int[] iArr110 = f14030a;
                SVGElem sVGElem21 = SVGElem.d;
                iArr110[20] = 21;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                int[] iArr111 = f14030a;
                SVGElem sVGElem22 = SVGElem.d;
                iArr111[26] = 22;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                int[] iArr112 = f14030a;
                SVGElem sVGElem23 = SVGElem.d;
                iArr112[5] = 23;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                int[] iArr113 = f14030a;
                SVGElem sVGElem24 = SVGElem.d;
                iArr113[3] = 24;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                int[] iArr114 = f14030a;
                SVGElem sVGElem25 = SVGElem.d;
                iArr114[25] = 25;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                int[] iArr115 = f14030a;
                SVGElem sVGElem26 = SVGElem.d;
                iArr115[14] = 26;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                int[] iArr116 = f14030a;
                SVGElem sVGElem27 = SVGElem.d;
                iArr116[8] = 27;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                int[] iArr117 = f14030a;
                SVGElem sVGElem28 = SVGElem.d;
                iArr117[30] = 28;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                int[] iArr118 = f14030a;
                SVGElem sVGElem29 = SVGElem.d;
                iArr118[12] = 29;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                int[] iArr119 = f14030a;
                SVGElem sVGElem30 = SVGElem.d;
                iArr119[21] = 30;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                int[] iArr120 = f14030a;
                SVGElem sVGElem31 = SVGElem.d;
                iArr120[19] = 31;
            } catch (NoSuchFieldError unused120) {
            }
        }
    }

    public static class AspectRatioKeywords {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f14031a;

        static {
            HashMap map = new HashMap(10);
            f14031a = map;
            map.put(DevicePublicKeyStringDef.NONE, PreserveAspectRatio.Alignment.d);
            map.put("xMinYMin", PreserveAspectRatio.Alignment.e);
            map.put("xMidYMin", PreserveAspectRatio.Alignment.f);
            map.put("xMaxYMin", PreserveAspectRatio.Alignment.g);
            map.put("xMinYMid", PreserveAspectRatio.Alignment.h);
            map.put("xMidYMid", PreserveAspectRatio.Alignment.i);
            map.put("xMaxYMid", PreserveAspectRatio.Alignment.j);
            map.put("xMinYMax", PreserveAspectRatio.Alignment.k);
            map.put("xMidYMax", PreserveAspectRatio.Alignment.l);
            map.put("xMaxYMax", PreserveAspectRatio.Alignment.m);
        }
    }

    public static class ColourKeywords {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f14032a;

        static {
            HashMap map = new HashMap(47);
            f14032a = map;
            a.u(-984833, map, "aliceblue", -332841, "antiquewhite");
            androidx.compose.ui.input.pointer.a.x(map, "aqua", -16711681, -8388652, "aquamarine");
            a.u(-983041, map, "azure", -657956, "beige");
            a.u(-6972, map, "bisque", -16777216, "black");
            a.u(-5171, map, "blanchedalmond", -16776961, "blue");
            a.u(-7722014, map, "blueviolet", -5952982, "brown");
            a.u(-2180985, map, "burlywood", -10510688, "cadetblue");
            a.u(-8388864, map, "chartreuse", -2987746, "chocolate");
            a.u(-32944, map, "coral", -10185235, "cornflowerblue");
            a.u(-1828, map, "cornsilk", -2354116, "crimson");
            androidx.compose.ui.input.pointer.a.x(map, "cyan", -16711681, -16777077, "darkblue");
            a.u(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
            androidx.compose.ui.input.pointer.a.x(map, "darkgray", -5658199, -16751616, "darkgreen");
            androidx.compose.ui.input.pointer.a.x(map, "darkgrey", -5658199, -4343957, "darkkhaki");
            a.u(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
            a.u(-29696, map, "darkorange", -6737204, "darkorchid");
            a.u(-7667712, map, "darkred", -1468806, "darksalmon");
            a.u(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
            map.put("darkslategray", -13676721);
            map.put("darkslategrey", -13676721);
            androidx.compose.ui.input.pointer.a.x(map, "darkturquoise", -16724271, -7077677, "darkviolet");
            a.u(-60269, map, "deeppink", -16728065, "deepskyblue");
            map.put("dimgray", -9868951);
            map.put("dimgrey", -9868951);
            androidx.compose.ui.input.pointer.a.x(map, "dodgerblue", -14774017, -5103070, "firebrick");
            a.u(-1296, map, "floralwhite", -14513374, "forestgreen");
            androidx.compose.ui.input.pointer.a.x(map, "fuchsia", -65281, -2302756, "gainsboro");
            a.u(-460545, map, "ghostwhite", -10496, "gold");
            map.put("goldenrod", -2448096);
            map.put("gray", -8355712);
            a.u(-16744448, map, "green", -5374161, "greenyellow");
            androidx.compose.ui.input.pointer.a.x(map, "grey", -8355712, -983056, "honeydew");
            a.u(-38476, map, "hotpink", -3318692, "indianred");
            a.u(-11861886, map, "indigo", -16, "ivory");
            a.u(-989556, map, "khaki", -1644806, "lavender");
            a.u(-3851, map, "lavenderblush", -8586240, "lawngreen");
            a.u(-1331, map, "lemonchiffon", -5383962, "lightblue");
            a.u(-1015680, map, "lightcoral", -2031617, "lightcyan");
            map.put("lightgoldenrodyellow", -329006);
            map.put("lightgray", -2894893);
            map.put("lightgreen", -7278960);
            map.put("lightgrey", -2894893);
            a.u(-18751, map, "lightpink", -24454, "lightsalmon");
            a.u(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
            map.put("lightslategray", -8943463);
            map.put("lightslategrey", -8943463);
            androidx.compose.ui.input.pointer.a.x(map, "lightsteelblue", -5192482, -32, "lightyellow");
            a.u(-16711936, map, "lime", -13447886, "limegreen");
            map.put("linen", -331546);
            map.put("magenta", -65281);
            a.u(-8388608, map, "maroon", -10039894, "mediumaquamarine");
            a.u(-16777011, map, "mediumblue", -4565549, "mediumorchid");
            a.u(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
            a.u(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
            a.u(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
            a.u(-15132304, map, "midnightblue", -655366, "mintcream");
            a.u(-6943, map, "mistyrose", -6987, "moccasin");
            a.u(-8531, map, "navajowhite", -16777088, "navy");
            a.u(-133658, map, "oldlace", -8355840, "olive");
            a.u(-9728477, map, "olivedrab", -23296, "orange");
            a.u(-47872, map, "orangered", -2461482, "orchid");
            a.u(-1120086, map, "palegoldenrod", -6751336, "palegreen");
            a.u(-5247250, map, "paleturquoise", -2396013, "palevioletred");
            a.u(-4139, map, "papayawhip", -9543, "peachpuff");
            a.u(-3308225, map, "peru", -16181, "pink");
            a.u(-2252579, map, "plum", -5185306, "powderblue");
            a.u(-8388480, map, "purple", -10079335, "rebeccapurple");
            a.u(-65536, map, "red", -4419697, "rosybrown");
            a.u(-12490271, map, "royalblue", -7650029, "saddlebrown");
            a.u(-360334, map, "salmon", -744352, "sandybrown");
            a.u(-13726889, map, "seagreen", -2578, "seashell");
            a.u(-6270419, map, "sienna", -4144960, "silver");
            a.u(-7876885, map, "skyblue", -9807155, "slateblue");
            map.put("slategray", -9404272);
            map.put("slategrey", -9404272);
            androidx.compose.ui.input.pointer.a.x(map, "snow", -1286, -16711809, "springgreen");
            a.u(-12156236, map, "steelblue", -2968436, "tan");
            a.u(-16744320, map, "teal", -2572328, "thistle");
            a.u(-40121, map, "tomato", -12525360, "turquoise");
            a.u(-1146130, map, "violet", -663885, "wheat");
            a.u(-1, map, "white", -657931, "whitesmoke");
            a.u(-256, map, "yellow", -6632142, "yellowgreen");
            map.put("transparent", 0);
        }
    }

    public static class FontSizeKeywords {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f14033a;

        static {
            HashMap map = new HashMap(9);
            f14033a = map;
            SVG.Unit unit = SVG.Unit.g;
            map.put("xx-small", new SVG.Length(0.694f, unit));
            map.put("x-small", new SVG.Length(0.833f, unit));
            map.put("small", new SVG.Length(10.0f, unit));
            map.put("medium", new SVG.Length(12.0f, unit));
            map.put("large", new SVG.Length(14.4f, unit));
            map.put("x-large", new SVG.Length(17.3f, unit));
            map.put("xx-large", new SVG.Length(20.7f, unit));
            SVG.Unit unit2 = SVG.Unit.h;
            map.put("smaller", new SVG.Length(83.33f, unit2));
            map.put("larger", new SVG.Length(120.0f, unit2));
        }
    }

    public static class FontWeightKeywords {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f14034a;

        static {
            HashMap map = new HashMap(13);
            f14034a = map;
            map.put("normal", 400);
            map.put("bold", 700);
            a.u(1, map, "bolder", -1, "lighter");
            a.u(100, map, "100", 200, "200");
            map.put("300", Integer.valueOf(nlnlnnn.xxx00780078x0078));
            map.put("400", 400);
            a.u(500, map, "500", 600, "600");
            androidx.compose.ui.input.pointer.a.x(map, "700", 700, 800, "800");
            map.put("900", 900);
        }
    }

    public class SAXHandler extends DefaultHandler2 {
        public SAXHandler() {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void characters(char[] cArr, int i, int i2) {
            SVGParser.this.H(new String(cArr, i, i2));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void endDocument() {
            SVGParser.this.getClass();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void endElement(String str, String str2, String str3) {
            SVGParser.this.c(str, str2, str3);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void processingInstruction(String str, String str2) {
            SVGParser.z(new TextScanner(str2));
            str.equals("xml-stylesheet");
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void startDocument() {
            SVGParser.this.F();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void startElement(String str, String str2, String str3, Attributes attributes) throws SVGParseException {
            SVGParser.this.G(str, str2, str3, attributes);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SVGAttr {
        public static final SVGAttr d;
        public static final SVGAttr e;
        public static final SVGAttr f;
        public static final SVGAttr g;
        public static final HashMap h;
        public static final /* synthetic */ SVGAttr[] i;

        static {
            SVGAttr sVGAttr = new SVGAttr("CLASS", 0);
            d = sVGAttr;
            SVGAttr sVGAttr2 = new SVGAttr("clip", 1);
            SVGAttr sVGAttr3 = new SVGAttr("clip_path", 2);
            SVGAttr sVGAttr4 = new SVGAttr("clipPathUnits", 3);
            SVGAttr sVGAttr5 = new SVGAttr("clip_rule", 4);
            SVGAttr sVGAttr6 = new SVGAttr("color", 5);
            SVGAttr sVGAttr7 = new SVGAttr("cx", 6);
            SVGAttr sVGAttr8 = new SVGAttr("cy", 7);
            SVGAttr sVGAttr9 = new SVGAttr("direction", 8);
            SVGAttr sVGAttr10 = new SVGAttr("dx", 9);
            SVGAttr sVGAttr11 = new SVGAttr("dy", 10);
            SVGAttr sVGAttr12 = new SVGAttr("fx", 11);
            SVGAttr sVGAttr13 = new SVGAttr("fy", 12);
            SVGAttr sVGAttr14 = new SVGAttr("d", 13);
            SVGAttr sVGAttr15 = new SVGAttr("display", 14);
            SVGAttr sVGAttr16 = new SVGAttr("fill", 15);
            SVGAttr sVGAttr17 = new SVGAttr("fill_rule", 16);
            SVGAttr sVGAttr18 = new SVGAttr("fill_opacity", 17);
            SVGAttr sVGAttr19 = new SVGAttr("font", 18);
            SVGAttr sVGAttr20 = new SVGAttr("font_family", 19);
            SVGAttr sVGAttr21 = new SVGAttr("font_size", 20);
            SVGAttr sVGAttr22 = new SVGAttr("font_weight", 21);
            SVGAttr sVGAttr23 = new SVGAttr("font_style", 22);
            SVGAttr sVGAttr24 = new SVGAttr("gradientTransform", 23);
            SVGAttr sVGAttr25 = new SVGAttr("gradientUnits", 24);
            SVGAttr sVGAttr26 = new SVGAttr("height", 25);
            SVGAttr sVGAttr27 = new SVGAttr("href", 26);
            SVGAttr sVGAttr28 = new SVGAttr("image_rendering", 27);
            SVGAttr sVGAttr29 = new SVGAttr("marker", 28);
            SVGAttr sVGAttr30 = new SVGAttr("marker_start", 29);
            SVGAttr sVGAttr31 = new SVGAttr("marker_mid", 30);
            SVGAttr sVGAttr32 = new SVGAttr("marker_end", 31);
            SVGAttr sVGAttr33 = new SVGAttr("markerHeight", 32);
            SVGAttr sVGAttr34 = new SVGAttr("markerUnits", 33);
            SVGAttr sVGAttr35 = new SVGAttr("markerWidth", 34);
            SVGAttr sVGAttr36 = new SVGAttr("mask", 35);
            SVGAttr sVGAttr37 = new SVGAttr("maskContentUnits", 36);
            SVGAttr sVGAttr38 = new SVGAttr("maskUnits", 37);
            SVGAttr sVGAttr39 = new SVGAttr("media", 38);
            SVGAttr sVGAttr40 = new SVGAttr("offset", 39);
            SVGAttr sVGAttr41 = new SVGAttr("opacity", 40);
            SVGAttr sVGAttr42 = new SVGAttr("orient", 41);
            SVGAttr sVGAttr43 = new SVGAttr("overflow", 42);
            SVGAttr sVGAttr44 = new SVGAttr("pathLength", 43);
            SVGAttr sVGAttr45 = new SVGAttr("patternContentUnits", 44);
            SVGAttr sVGAttr46 = new SVGAttr("patternTransform", 45);
            SVGAttr sVGAttr47 = new SVGAttr("patternUnits", 46);
            SVGAttr sVGAttr48 = new SVGAttr("points", 47);
            e = sVGAttr48;
            SVGAttr sVGAttr49 = new SVGAttr("preserveAspectRatio", 48);
            SVGAttr sVGAttr50 = new SVGAttr("r", 49);
            SVGAttr sVGAttr51 = new SVGAttr("refX", 50);
            SVGAttr sVGAttr52 = new SVGAttr("refY", 51);
            SVGAttr sVGAttr53 = new SVGAttr("requiredFeatures", 52);
            SVGAttr sVGAttr54 = new SVGAttr("requiredExtensions", 53);
            SVGAttr sVGAttr55 = new SVGAttr("requiredFormats", 54);
            SVGAttr sVGAttr56 = new SVGAttr("requiredFonts", 55);
            SVGAttr sVGAttr57 = new SVGAttr("rx", 56);
            SVGAttr sVGAttr58 = new SVGAttr("ry", 57);
            SVGAttr sVGAttr59 = new SVGAttr("solid_color", 58);
            SVGAttr sVGAttr60 = new SVGAttr("solid_opacity", 59);
            SVGAttr sVGAttr61 = new SVGAttr("spreadMethod", 60);
            SVGAttr sVGAttr62 = new SVGAttr("startOffset", 61);
            SVGAttr sVGAttr63 = new SVGAttr("stop_color", 62);
            SVGAttr sVGAttr64 = new SVGAttr("stop_opacity", 63);
            SVGAttr sVGAttr65 = new SVGAttr("stroke", 64);
            SVGAttr sVGAttr66 = new SVGAttr("stroke_dasharray", 65);
            SVGAttr sVGAttr67 = new SVGAttr("stroke_dashoffset", 66);
            SVGAttr sVGAttr68 = new SVGAttr("stroke_linecap", 67);
            SVGAttr sVGAttr69 = new SVGAttr("stroke_linejoin", 68);
            SVGAttr sVGAttr70 = new SVGAttr("stroke_miterlimit", 69);
            SVGAttr sVGAttr71 = new SVGAttr("stroke_opacity", 70);
            SVGAttr sVGAttr72 = new SVGAttr("stroke_width", 71);
            SVGAttr sVGAttr73 = new SVGAttr("style", 72);
            SVGAttr sVGAttr74 = new SVGAttr("systemLanguage", 73);
            SVGAttr sVGAttr75 = new SVGAttr("text_anchor", 74);
            SVGAttr sVGAttr76 = new SVGAttr("text_decoration", 75);
            SVGAttr sVGAttr77 = new SVGAttr("transform", 76);
            f = sVGAttr77;
            SVGAttr sVGAttr78 = new SVGAttr("type", 77);
            SVGAttr sVGAttr79 = new SVGAttr("vector_effect", 78);
            SVGAttr sVGAttr80 = new SVGAttr("version", 79);
            SVGAttr sVGAttr81 = new SVGAttr("viewBox", 80);
            SVGAttr sVGAttr82 = new SVGAttr("width", 81);
            SVGAttr sVGAttr83 = new SVGAttr("x", 82);
            SVGAttr sVGAttr84 = new SVGAttr("y", 83);
            SVGAttr sVGAttr85 = new SVGAttr("x1", 84);
            SVGAttr sVGAttr86 = new SVGAttr("y1", 85);
            SVGAttr sVGAttr87 = new SVGAttr("x2", 86);
            SVGAttr sVGAttr88 = new SVGAttr("y2", 87);
            SVGAttr sVGAttr89 = new SVGAttr("viewport_fill", 88);
            SVGAttr sVGAttr90 = new SVGAttr("viewport_fill_opacity", 89);
            SVGAttr sVGAttr91 = new SVGAttr("visibility", 90);
            SVGAttr sVGAttr92 = new SVGAttr("UNSUPPORTED", 91);
            g = sVGAttr92;
            i = new SVGAttr[]{sVGAttr, sVGAttr2, sVGAttr3, sVGAttr4, sVGAttr5, sVGAttr6, sVGAttr7, sVGAttr8, sVGAttr9, sVGAttr10, sVGAttr11, sVGAttr12, sVGAttr13, sVGAttr14, sVGAttr15, sVGAttr16, sVGAttr17, sVGAttr18, sVGAttr19, sVGAttr20, sVGAttr21, sVGAttr22, sVGAttr23, sVGAttr24, sVGAttr25, sVGAttr26, sVGAttr27, sVGAttr28, sVGAttr29, sVGAttr30, sVGAttr31, sVGAttr32, sVGAttr33, sVGAttr34, sVGAttr35, sVGAttr36, sVGAttr37, sVGAttr38, sVGAttr39, sVGAttr40, sVGAttr41, sVGAttr42, sVGAttr43, sVGAttr44, sVGAttr45, sVGAttr46, sVGAttr47, sVGAttr48, sVGAttr49, sVGAttr50, sVGAttr51, sVGAttr52, sVGAttr53, sVGAttr54, sVGAttr55, sVGAttr56, sVGAttr57, sVGAttr58, sVGAttr59, sVGAttr60, sVGAttr61, sVGAttr62, sVGAttr63, sVGAttr64, sVGAttr65, sVGAttr66, sVGAttr67, sVGAttr68, sVGAttr69, sVGAttr70, sVGAttr71, sVGAttr72, sVGAttr73, sVGAttr74, sVGAttr75, sVGAttr76, sVGAttr77, sVGAttr78, sVGAttr79, sVGAttr80, sVGAttr81, sVGAttr82, sVGAttr83, sVGAttr84, sVGAttr85, sVGAttr86, sVGAttr87, sVGAttr88, sVGAttr89, sVGAttr90, sVGAttr91, sVGAttr92};
            h = new HashMap();
            for (SVGAttr sVGAttr93 : values()) {
                if (sVGAttr93 == d) {
                    h.put("class", sVGAttr93);
                } else if (sVGAttr93 != g) {
                    h.put(sVGAttr93.name().replace('_', '-'), sVGAttr93);
                }
            }
        }

        public static SVGAttr a(String str) {
            SVGAttr sVGAttr = (SVGAttr) h.get(str);
            return sVGAttr != null ? sVGAttr : g;
        }

        public static SVGAttr valueOf(String str) {
            return (SVGAttr) Enum.valueOf(SVGAttr.class, str);
        }

        public static SVGAttr[] values() {
            return (SVGAttr[]) i.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SVGElem {
        public static final SVGElem d;
        public static final SVGElem e;
        public static final SVGElem f;
        public static final SVGElem g;
        public static final HashMap h;
        public static final /* synthetic */ SVGElem[] i;

        /* JADX INFO: Fake field, exist only in values array */
        SVGElem EF1;

        static {
            SVGElem sVGElem = new SVGElem("svg", 0);
            SVGElem sVGElem2 = new SVGElem("a", 1);
            SVGElem sVGElem3 = new SVGElem("circle", 2);
            SVGElem sVGElem4 = new SVGElem("clipPath", 3);
            SVGElem sVGElem5 = new SVGElem("defs", 4);
            SVGElem sVGElem6 = new SVGElem("desc", 5);
            d = sVGElem6;
            SVGElem sVGElem7 = new SVGElem("ellipse", 6);
            SVGElem sVGElem8 = new SVGElem("g", 7);
            SVGElem sVGElem9 = new SVGElem("image", 8);
            SVGElem sVGElem10 = new SVGElem("line", 9);
            SVGElem sVGElem11 = new SVGElem("linearGradient", 10);
            SVGElem sVGElem12 = new SVGElem("marker", 11);
            SVGElem sVGElem13 = new SVGElem("mask", 12);
            SVGElem sVGElem14 = new SVGElem(com.salesforce.marketingcloud.config.a.j, 13);
            SVGElem sVGElem15 = new SVGElem("pattern", 14);
            SVGElem sVGElem16 = new SVGElem("polygon", 15);
            SVGElem sVGElem17 = new SVGElem("polyline", 16);
            SVGElem sVGElem18 = new SVGElem("radialGradient", 17);
            SVGElem sVGElem19 = new SVGElem("rect", 18);
            SVGElem sVGElem20 = new SVGElem("solidColor", 19);
            SVGElem sVGElem21 = new SVGElem("stop", 20);
            SVGElem sVGElem22 = new SVGElem("style", 21);
            SVGElem sVGElem23 = new SVGElem("SWITCH", 22);
            e = sVGElem23;
            SVGElem sVGElem24 = new SVGElem("symbol", 23);
            SVGElem sVGElem25 = new SVGElem(TextBundle.TEXT_ENTRY, 24);
            SVGElem sVGElem26 = new SVGElem("textPath", 25);
            SVGElem sVGElem27 = new SVGElem("title", 26);
            f = sVGElem27;
            SVGElem sVGElem28 = new SVGElem("tref", 27);
            SVGElem sVGElem29 = new SVGElem("tspan", 28);
            SVGElem sVGElem30 = new SVGElem("use", 29);
            SVGElem sVGElem31 = new SVGElem("view", 30);
            SVGElem sVGElem32 = new SVGElem("UNSUPPORTED", 31);
            g = sVGElem32;
            i = new SVGElem[]{sVGElem, sVGElem2, sVGElem3, sVGElem4, sVGElem5, sVGElem6, sVGElem7, sVGElem8, sVGElem9, sVGElem10, sVGElem11, sVGElem12, sVGElem13, sVGElem14, sVGElem15, sVGElem16, sVGElem17, sVGElem18, sVGElem19, sVGElem20, sVGElem21, sVGElem22, sVGElem23, sVGElem24, sVGElem25, sVGElem26, sVGElem27, sVGElem28, sVGElem29, sVGElem30, sVGElem31, sVGElem32};
            h = new HashMap();
            for (SVGElem sVGElem33 : values()) {
                if (sVGElem33 == e) {
                    h.put("switch", sVGElem33);
                } else if (sVGElem33 != g) {
                    h.put(sVGElem33.name(), sVGElem33);
                }
            }
        }

        public static SVGElem valueOf(String str) {
            return (SVGElem) Enum.valueOf(SVGElem.class, str);
        }

        public static SVGElem[] values() {
            return (SVGElem[]) i.clone();
        }
    }

    public static class TextScanner {

        /* renamed from: a, reason: collision with root package name */
        public final String f14036a;
        public final int c;
        public int b = 0;
        public final NumberParser d = new NumberParser();

        public TextScanner(String str) {
            this.c = 0;
            String strTrim = str.trim();
            this.f14036a = strTrim;
            this.c = strTrim.length();
        }

        public static boolean g(int i) {
            return i == 32 || i == 10 || i == 13 || i == 9;
        }

        public final int a() {
            int i = this.b;
            int i2 = this.c;
            if (i == i2) {
                return -1;
            }
            int i3 = i + 1;
            this.b = i3;
            if (i3 < i2) {
                return this.f14036a.charAt(i3);
            }
            return -1;
        }

        public final Boolean b(Object obj) {
            if (obj == null) {
                return null;
            }
            p();
            int i = this.b;
            if (i == this.c) {
                return null;
            }
            char cCharAt = this.f14036a.charAt(i);
            if (cCharAt != '0' && cCharAt != '1') {
                return null;
            }
            this.b++;
            return Boolean.valueOf(cCharAt == '1');
        }

        public final float c(float f) {
            if (Float.isNaN(f)) {
                return Float.NaN;
            }
            p();
            return i();
        }

        public final boolean d(char c) {
            int i = this.b;
            boolean z = i < this.c && this.f14036a.charAt(i) == c;
            if (z) {
                this.b++;
            }
            return z;
        }

        public final boolean e(String str) {
            int length = str.length();
            int i = this.b;
            boolean z = i <= this.c - length && this.f14036a.substring(i, i + length).equals(str);
            if (z) {
                this.b += length;
            }
            return z;
        }

        public final boolean f() {
            return this.b == this.c;
        }

        public final Integer h() {
            int i = this.b;
            if (i == this.c) {
                return null;
            }
            this.b = i + 1;
            return Integer.valueOf(this.f14036a.charAt(i));
        }

        public final float i() {
            int i = this.b;
            int i2 = this.c;
            NumberParser numberParser = this.d;
            float fA = numberParser.a(i, i2, this.f14036a);
            if (!Float.isNaN(fA)) {
                this.b = numberParser.f14007a;
            }
            return fA;
        }

        public final SVG.Length j() {
            float fI = i();
            if (Float.isNaN(fI)) {
                return null;
            }
            SVG.Unit unitN = n();
            return unitN == null ? new SVG.Length(fI, SVG.Unit.d) : new SVG.Length(fI, unitN);
        }

        public final String k() {
            if (f()) {
                return null;
            }
            int i = this.b;
            String str = this.f14036a;
            char cCharAt = str.charAt(i);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            int iA = a();
            while (iA != -1 && iA != cCharAt) {
                iA = a();
            }
            if (iA == -1) {
                this.b = i;
                return null;
            }
            int i2 = this.b;
            this.b = i2 + 1;
            return str.substring(i + 1, i2);
        }

        public final String l() {
            return m(' ', false);
        }

        public final String m(char c, boolean z) {
            if (f()) {
                return null;
            }
            int i = this.b;
            String str = this.f14036a;
            char cCharAt = str.charAt(i);
            if ((!z && g(cCharAt)) || cCharAt == c) {
                return null;
            }
            int i2 = this.b;
            int iA = a();
            while (iA != -1 && iA != c && (z || !g(iA))) {
                iA = a();
            }
            return str.substring(i2, this.b);
        }

        public final SVG.Unit n() {
            if (f()) {
                return null;
            }
            int i = this.b;
            String str = this.f14036a;
            if (str.charAt(i) == '%') {
                this.b++;
                return SVG.Unit.h;
            }
            int i2 = this.b;
            if (i2 > this.c - 2) {
                return null;
            }
            try {
                SVG.Unit unitValueOf = SVG.Unit.valueOf(str.substring(i2, i2 + 2).toLowerCase(Locale.US));
                this.b += 2;
                return unitValueOf;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final float o() {
            p();
            int i = this.b;
            int i2 = this.c;
            NumberParser numberParser = this.d;
            float fA = numberParser.a(i, i2, this.f14036a);
            if (!Float.isNaN(fA)) {
                this.b = numberParser.f14007a;
            }
            return fA;
        }

        public final boolean p() {
            q();
            int i = this.b;
            if (i == this.c || this.f14036a.charAt(i) != ',') {
                return false;
            }
            this.b++;
            q();
            return true;
        }

        public final void q() {
            while (true) {
                int i = this.b;
                if (i >= this.c || !g(this.f14036a.charAt(i))) {
                    return;
                } else {
                    this.b++;
                }
            }
        }
    }

    public class XPPAttributesWrapper implements Attributes {

        /* renamed from: a, reason: collision with root package name */
        public XmlPullParser f14037a;

        @Override // org.xml.sax.Attributes
        public final int getIndex(String str) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public final int getLength() {
            return this.f14037a.getAttributeCount();
        }

        @Override // org.xml.sax.Attributes
        public final String getLocalName(int i) {
            return this.f14037a.getAttributeName(i);
        }

        @Override // org.xml.sax.Attributes
        public final String getQName(int i) {
            XmlPullParser xmlPullParser = this.f14037a;
            String attributeName = xmlPullParser.getAttributeName(i);
            if (xmlPullParser.getAttributePrefix(i) == null) {
                return attributeName;
            }
            return xmlPullParser.getAttributePrefix(i) + ':' + attributeName;
        }

        @Override // org.xml.sax.Attributes
        public final String getType(int i) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final String getURI(int i) {
            return this.f14037a.getAttributeNamespace(i);
        }

        @Override // org.xml.sax.Attributes
        public final String getValue(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final int getIndex(String str, String str2) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public final String getType(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final String getValue(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final String getType(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final String getValue(int i) {
            return this.f14037a.getAttributeValue(i);
        }
    }

    public static Matrix A(String str) throws SVGParseException {
        Matrix matrix = new Matrix();
        TextScanner textScanner = new TextScanner(str);
        textScanner.q();
        while (!textScanner.f()) {
            String strSubstring = null;
            if (!textScanner.f()) {
                int i = textScanner.b;
                String str2 = textScanner.f14036a;
                int iCharAt = str2.charAt(i);
                while (true) {
                    if ((iCharAt >= 97 && iCharAt <= 122) || (iCharAt >= 65 && iCharAt <= 90)) {
                        iCharAt = textScanner.a();
                    }
                }
                int i2 = textScanner.b;
                while (TextScanner.g(iCharAt)) {
                    iCharAt = textScanner.a();
                }
                if (iCharAt == 40) {
                    textScanner.b++;
                    strSubstring = str2.substring(i, i2);
                } else {
                    textScanner.b = i;
                }
            }
            if (strSubstring == null) {
                throw new SVGParseException("Bad transform function encountered in transform list: ".concat(str));
            }
            switch (strSubstring) {
                case "matrix":
                    textScanner.q();
                    float fI = textScanner.i();
                    textScanner.p();
                    float fI2 = textScanner.i();
                    textScanner.p();
                    float fI3 = textScanner.i();
                    textScanner.p();
                    float fI4 = textScanner.i();
                    textScanner.p();
                    float fI5 = textScanner.i();
                    textScanner.p();
                    float fI6 = textScanner.i();
                    textScanner.q();
                    if (!Float.isNaN(fI6) && textScanner.d(')')) {
                        Matrix matrix2 = new Matrix();
                        matrix2.setValues(new float[]{fI, fI3, fI5, fI2, fI4, fI6, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f});
                        matrix.preConcat(matrix2);
                        break;
                    } else {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    break;
                case "rotate":
                    textScanner.q();
                    float fI7 = textScanner.i();
                    float fO = textScanner.o();
                    float fO2 = textScanner.o();
                    textScanner.q();
                    if (Float.isNaN(fI7) || !textScanner.d(')')) {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    if (Float.isNaN(fO)) {
                        matrix.preRotate(fI7);
                        break;
                    } else if (!Float.isNaN(fO2)) {
                        matrix.preRotate(fI7, fO, fO2);
                        break;
                    } else {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                case "scale":
                    textScanner.q();
                    float fI8 = textScanner.i();
                    float fO3 = textScanner.o();
                    textScanner.q();
                    if (!Float.isNaN(fI8) && textScanner.d(')')) {
                        if (!Float.isNaN(fO3)) {
                            matrix.preScale(fI8, fO3);
                            break;
                        } else {
                            matrix.preScale(fI8, fI8);
                            break;
                        }
                    } else {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    break;
                case "skewX":
                    textScanner.q();
                    float fI9 = textScanner.i();
                    textScanner.q();
                    if (!Float.isNaN(fI9) && textScanner.d(')')) {
                        matrix.preSkew((float) Math.tan(Math.toRadians(fI9)), BitmapDescriptorFactory.HUE_RED);
                        break;
                    } else {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    break;
                case "skewY":
                    textScanner.q();
                    float fI10 = textScanner.i();
                    textScanner.q();
                    if (!Float.isNaN(fI10) && textScanner.d(')')) {
                        matrix.preSkew(BitmapDescriptorFactory.HUE_RED, (float) Math.tan(Math.toRadians(fI10)));
                        break;
                    } else {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    break;
                case "translate":
                    textScanner.q();
                    float fI11 = textScanner.i();
                    float fO4 = textScanner.o();
                    textScanner.q();
                    if (!Float.isNaN(fI11) && textScanner.d(')')) {
                        if (!Float.isNaN(fO4)) {
                            matrix.preTranslate(fI11, fO4);
                            break;
                        } else {
                            matrix.preTranslate(fI11, BitmapDescriptorFactory.HUE_RED);
                            break;
                        }
                    } else {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                default:
                    throw new SVGParseException(YU.a.h("Invalid transform list fn: ", strSubstring, ")"));
            }
            if (textScanner.f()) {
                return matrix;
            }
            textScanner.p();
        }
        return matrix;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0678  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void E(com.caverock.androidsvg.SVG.Style r21, java.lang.String r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 1980
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.E(com.caverock.androidsvg.SVG$Style, java.lang.String, java.lang.String):void");
    }

    public static int b(float f) {
        if (f < BitmapDescriptorFactory.HUE_RED) {
            return 0;
        }
        if (f > 255.0f) {
            return 255;
        }
        return Math.round(f);
    }

    public static int d(float f, float f2, float f3) {
        float f4 = BitmapDescriptorFactory.HUE_RED;
        float f5 = f % 360.0f;
        if (f < BitmapDescriptorFactory.HUE_RED) {
            f5 += 360.0f;
        }
        float f6 = f5 / 60.0f;
        float f7 = f2 / 100.0f;
        float f8 = f3 / 100.0f;
        if (f7 < BitmapDescriptorFactory.HUE_RED) {
            f7 = 0.0f;
        } else if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        if (f8 >= BitmapDescriptorFactory.HUE_RED) {
            f4 = f8 > 1.0f ? 1.0f : f8;
        }
        float f9 = f4 <= 0.5f ? (f7 + 1.0f) * f4 : (f4 + f7) - (f7 * f4);
        float f10 = (f4 * 2.0f) - f9;
        return b(e(f10, f9, f6 - 2.0f) * 256.0f) | (b(e(f10, f9, f6 + 2.0f) * 256.0f) << 16) | (b(e(f10, f9, f6) * 256.0f) << 8);
    }

    public static float e(float f, float f2, float f3) {
        if (f3 < BitmapDescriptorFactory.HUE_RED) {
            f3 += 6.0f;
        }
        if (f3 >= 6.0f) {
            f3 -= 6.0f;
        }
        return f3 < 1.0f ? YU.a.a(f2, f, f3, f) : f3 < 3.0f ? f2 : f3 < 4.0f ? YU.a.a(4.0f, f3, f2 - f, f) : f;
    }

    public static void g(SVG.SvgConditional svgConditional, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = SVGAttr.a(attributes.getLocalName(i)).ordinal();
            if (iOrdinal != 73) {
                switch (iOrdinal) {
                    case 52:
                        TextScanner textScanner = new TextScanner(strTrim);
                        HashSet hashSet = new HashSet();
                        while (!textScanner.f()) {
                            String strL = textScanner.l();
                            if (strL.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                                hashSet.add(strL.substring(35));
                            } else {
                                hashSet.add("UNSUPPORTED");
                            }
                            textScanner.q();
                        }
                        svgConditional.f(hashSet);
                        break;
                    case 53:
                        svgConditional.j(strTrim);
                        break;
                    case 54:
                        TextScanner textScanner2 = new TextScanner(strTrim);
                        HashSet hashSet2 = new HashSet();
                        while (!textScanner2.f()) {
                            hashSet2.add(textScanner2.l());
                            textScanner2.q();
                        }
                        svgConditional.c(hashSet2);
                        break;
                    case 55:
                        ArrayList arrayListR = r(strTrim);
                        svgConditional.i(arrayListR != null ? new HashSet(arrayListR) : new HashSet(0));
                        break;
                }
            } else {
                TextScanner textScanner3 = new TextScanner(strTrim);
                HashSet hashSet3 = new HashSet();
                while (!textScanner3.f()) {
                    String strL2 = textScanner3.l();
                    int iIndexOf = strL2.indexOf(45);
                    if (iIndexOf != -1) {
                        strL2 = strL2.substring(0, iIndexOf);
                    }
                    hashSet3.add(new Locale(strL2, "", "").getLanguage());
                    textScanner3.q();
                }
                svgConditional.g(hashSet3);
            }
        }
    }

    public static void h(SVG.SvgElementBase svgElementBase, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                svgElementBase.c = attributes.getValue(i).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i).trim();
                if ("default".equals(strTrim)) {
                    svgElementBase.d = Boolean.FALSE;
                    return;
                } else {
                    if (!"preserve".equals(strTrim)) {
                        throw new SVGParseException(YU.a.A("Invalid value for \"xml:space\" attribute: ", strTrim));
                    }
                    svgElementBase.d = Boolean.TRUE;
                    return;
                }
            }
        }
    }

    public static void i(SVG.GradientElement gradientElement, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = SVGAttr.a(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 23) {
                gradientElement.j = A(strTrim);
            } else if (iOrdinal != 24) {
                if (iOrdinal != 26) {
                    if (iOrdinal != 60) {
                        continue;
                    } else {
                        try {
                            gradientElement.k = SVG.GradientSpread.valueOf(strTrim);
                        } catch (IllegalArgumentException unused) {
                            throw new SVGParseException(YU.a.h("Invalid spreadMethod attribute. \"", strTrim, "\" is not a valid value."));
                        }
                    }
                } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                    gradientElement.l = strTrim;
                }
            } else if ("objectBoundingBox".equals(strTrim)) {
                gradientElement.i = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(strTrim)) {
                    throw new SVGParseException("Invalid value for attribute gradientUnits");
                }
                gradientElement.i = Boolean.TRUE;
            }
        }
    }

    public static void j(SVG.PolyLine polyLine, Attributes attributes, String str) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (SVGAttr.a(attributes.getLocalName(i)) == SVGAttr.e) {
                TextScanner textScanner = new TextScanner(attributes.getValue(i));
                ArrayList arrayList = new ArrayList();
                textScanner.q();
                while (!textScanner.f()) {
                    float fI = textScanner.i();
                    if (Float.isNaN(fI)) {
                        throw new SVGParseException(YU.a.h("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                    textScanner.p();
                    float fI2 = textScanner.i();
                    if (Float.isNaN(fI2)) {
                        throw new SVGParseException(YU.a.h("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                    }
                    textScanner.p();
                    arrayList.add(Float.valueOf(fI));
                    arrayList.add(Float.valueOf(fI2));
                }
                polyLine.o = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    polyLine.o[i2] = ((Float) it.next()).floatValue();
                    i2++;
                }
            }
        }
    }

    public static void k(SVG.SvgElementBase svgElementBase, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            if (strTrim.length() != 0) {
                int iOrdinal = SVGAttr.a(attributes.getLocalName(i)).ordinal();
                if (iOrdinal == 0) {
                    CSSParser.CSSTextScanner cSSTextScanner = new CSSParser.CSSTextScanner(strTrim);
                    ArrayList arrayList = null;
                    while (!cSSTextScanner.f()) {
                        String strL = cSSTextScanner.l();
                        if (strL != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(strL);
                            cSSTextScanner.q();
                        }
                    }
                    svgElementBase.g = arrayList;
                } else if (iOrdinal != 72) {
                    if (svgElementBase.e == null) {
                        svgElementBase.e = new SVG.Style();
                    }
                    E(svgElementBase.e, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    TextScanner textScanner = new TextScanner(strTrim.replaceAll("/\\*.*?\\*/", ""));
                    while (true) {
                        String strM = textScanner.m(':', false);
                        textScanner.q();
                        if (!textScanner.d(':')) {
                            break;
                        }
                        textScanner.q();
                        String strM2 = textScanner.m(';', true);
                        if (strM2 == null) {
                            break;
                        }
                        textScanner.q();
                        if (textScanner.f() || textScanner.d(';')) {
                            if (svgElementBase.f == null) {
                                svgElementBase.f = new SVG.Style();
                            }
                            E(svgElementBase.f, strM, strM2);
                            textScanner.q();
                        }
                    }
                }
            }
        }
    }

    public static void l(SVG.TextPositionedContainer textPositionedContainer, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = SVGAttr.a(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 9) {
                textPositionedContainer.p = u(strTrim);
            } else if (iOrdinal == 10) {
                textPositionedContainer.q = u(strTrim);
            } else if (iOrdinal == 82) {
                textPositionedContainer.n = u(strTrim);
            } else if (iOrdinal == 83) {
                textPositionedContainer.o = u(strTrim);
            }
        }
    }

    public static void m(SVG.HasTransform hasTransform, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (SVGAttr.a(attributes.getLocalName(i)) == SVGAttr.f) {
                hasTransform.k(A(attributes.getValue(i)));
            }
        }
    }

    public static void n(SVG.SvgViewBoxContainer svgViewBoxContainer, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = SVGAttr.a(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 48) {
                y(svgViewBoxContainer, strTrim);
            } else if (iOrdinal != 80) {
                continue;
            } else {
                TextScanner textScanner = new TextScanner(strTrim);
                textScanner.q();
                float fI = textScanner.i();
                textScanner.p();
                float fI2 = textScanner.i();
                textScanner.p();
                float fI3 = textScanner.i();
                textScanner.p();
                float fI4 = textScanner.i();
                if (Float.isNaN(fI) || Float.isNaN(fI2) || Float.isNaN(fI3) || Float.isNaN(fI4)) {
                    throw new SVGParseException("Invalid viewBox definition - should have four numbers");
                }
                if (fI3 < BitmapDescriptorFactory.HUE_RED) {
                    throw new SVGParseException("Invalid viewBox. width cannot be negative");
                }
                if (fI4 < BitmapDescriptorFactory.HUE_RED) {
                    throw new SVGParseException("Invalid viewBox. height cannot be negative");
                }
                svgViewBoxContainer.o = new SVG.Box(fI, fI2, fI3, fI4);
            }
        }
    }

    public static SVG.Colour o(String str) throws SVGParseException {
        long j;
        int i;
        if (str.charAt(0) == '#') {
            int length = str.length();
            IntegerParser integerParser = null;
            if (1 < length) {
                long j2 = 0;
                int i2 = 1;
                while (i2 < length) {
                    char cCharAt = str.charAt(i2);
                    if (cCharAt < '0' || cCharAt > '9') {
                        if (cCharAt >= 'A' && cCharAt <= 'F') {
                            j = j2 * 16;
                            i = cCharAt - 'A';
                        } else {
                            if (cCharAt < 'a' || cCharAt > 'f') {
                                break;
                            }
                            j = j2 * 16;
                            i = cCharAt - 'a';
                        }
                        j2 = j + i + 10;
                    } else {
                        j2 = (j2 * 16) + (cCharAt - '0');
                    }
                    if (j2 > 4294967295L) {
                        break;
                    }
                    i2++;
                }
                if (i2 != 1) {
                    integerParser = new IntegerParser(j2, i2);
                }
            }
            if (integerParser == null) {
                throw new SVGParseException("Bad hex colour value: ".concat(str));
            }
            long j3 = integerParser.b;
            int i3 = integerParser.f14006a;
            if (i3 == 4) {
                int i4 = (int) j3;
                int i5 = i4 & 3840;
                int i6 = i4 & 240;
                int i7 = i4 & 15;
                return new SVG.Colour(i7 | (i5 << 8) | (-16777216) | (i5 << 12) | (i6 << 8) | (i6 << 4) | (i7 << 4));
            }
            if (i3 != 5) {
                if (i3 == 7) {
                    return new SVG.Colour(((int) j3) | (-16777216));
                }
                if (i3 != 9) {
                    throw new SVGParseException("Bad hex colour value: ".concat(str));
                }
                int i8 = (int) j3;
                return new SVG.Colour((i8 >>> 8) | (i8 << 24));
            }
            int i9 = (int) j3;
            int i10 = 61440 & i9;
            int i11 = i9 & 3840;
            int i12 = i9 & 240;
            int i13 = i9 & 15;
            return new SVG.Colour((i13 << 24) | (i13 << 28) | (i10 << 8) | (i10 << 4) | (i11 << 4) | i11 | i12 | (i12 >> 4));
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        if (zStartsWith || lowerCase.startsWith("rgb(")) {
            TextScanner textScanner = new TextScanner(str.substring(zStartsWith ? 5 : 4));
            textScanner.q();
            float fI = textScanner.i();
            if (!Float.isNaN(fI) && textScanner.d('%')) {
                fI = (fI * 256.0f) / 100.0f;
            }
            float fC = textScanner.c(fI);
            if (!Float.isNaN(fC) && textScanner.d('%')) {
                fC = (fC * 256.0f) / 100.0f;
            }
            float fC2 = textScanner.c(fC);
            if (!Float.isNaN(fC2) && textScanner.d('%')) {
                fC2 = (fC2 * 256.0f) / 100.0f;
            }
            if (!zStartsWith) {
                textScanner.q();
                if (Float.isNaN(fC2) || !textScanner.d(')')) {
                    throw new SVGParseException("Bad rgb() colour value: ".concat(str));
                }
                return new SVG.Colour((b(fI) << 16) | (-16777216) | (b(fC) << 8) | b(fC2));
            }
            float fC3 = textScanner.c(fC2);
            textScanner.q();
            if (Float.isNaN(fC3) || !textScanner.d(')')) {
                throw new SVGParseException("Bad rgba() colour value: ".concat(str));
            }
            return new SVG.Colour((b(fC3 * 256.0f) << 24) | (b(fI) << 16) | (b(fC) << 8) | b(fC2));
        }
        boolean zStartsWith2 = lowerCase.startsWith("hsla(");
        if (!zStartsWith2 && !lowerCase.startsWith("hsl(")) {
            Integer num = (Integer) ColourKeywords.f14032a.get(lowerCase);
            if (num != null) {
                return new SVG.Colour(num.intValue());
            }
            throw new SVGParseException("Invalid colour keyword: ".concat(lowerCase));
        }
        TextScanner textScanner2 = new TextScanner(str.substring(zStartsWith2 ? 5 : 4));
        textScanner2.q();
        float fI2 = textScanner2.i();
        float fC4 = textScanner2.c(fI2);
        if (!Float.isNaN(fC4)) {
            textScanner2.d('%');
        }
        float fC5 = textScanner2.c(fC4);
        if (!Float.isNaN(fC5)) {
            textScanner2.d('%');
        }
        if (!zStartsWith2) {
            textScanner2.q();
            if (Float.isNaN(fC5) || !textScanner2.d(')')) {
                throw new SVGParseException("Bad hsl() colour value: ".concat(str));
            }
            return new SVG.Colour(d(fI2, fC4, fC5) | (-16777216));
        }
        float fC6 = textScanner2.c(fC5);
        textScanner2.q();
        if (Float.isNaN(fC6) || !textScanner2.d(')')) {
            throw new SVGParseException("Bad hsla() colour value: ".concat(str));
        }
        return new SVG.Colour((b(fC6 * 256.0f) << 24) | d(fI2, fC4, fC5));
    }

    public static float p(int i, String str) throws SVGParseException {
        float fA = new NumberParser().a(0, i, str);
        if (Float.isNaN(fA)) {
            throw new SVGParseException(YU.a.A("Invalid float value: ", str));
        }
        return fA;
    }

    public static float q(String str) throws SVGParseException {
        int length = str.length();
        if (length != 0) {
            return p(length, str);
        }
        throw new SVGParseException("Invalid float value (empty string)");
    }

    public static ArrayList r(String str) {
        TextScanner textScanner = new TextScanner(str);
        ArrayList arrayList = null;
        do {
            String strK = textScanner.k();
            if (strK == null) {
                strK = textScanner.m(',', true);
            }
            if (strK == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strK);
            textScanner.p();
        } while (!textScanner.f());
        return arrayList;
    }

    public static String s(String str) {
        if (!str.equals(DevicePublicKeyStringDef.NONE) && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    public static SVG.Length t(String str) throws SVGParseException {
        SVG.Unit unitValueOf;
        if (str.length() == 0) {
            throw new SVGParseException("Invalid length value (empty string)");
        }
        int length = str.length();
        char cCharAt = str.charAt(length - 1);
        if (cCharAt == '%') {
            length--;
            unitValueOf = SVG.Unit.h;
        } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                unitValueOf = SVG.Unit.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new SVGParseException("Invalid length unit specifier: ".concat(str));
            }
        } else {
            unitValueOf = SVG.Unit.d;
        }
        try {
            return new SVG.Length(p(length, str), unitValueOf);
        } catch (NumberFormatException e) {
            throw new SVGParseException("Invalid length value: ".concat(str), e);
        }
    }

    public static ArrayList u(String str) throws SVGParseException {
        String str2;
        if (str.length() == 0) {
            throw new SVGParseException("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        TextScanner textScanner = new TextScanner(str);
        textScanner.q();
        while (!textScanner.f()) {
            float fI = textScanner.i();
            if (Float.isNaN(fI)) {
                StringBuilder sb = new StringBuilder("Invalid length list value: ");
                int i = textScanner.b;
                while (true) {
                    boolean zF = textScanner.f();
                    str2 = textScanner.f14036a;
                    if (zF || TextScanner.g(str2.charAt(textScanner.b))) {
                        break;
                    }
                    textScanner.b++;
                }
                String strSubstring = str2.substring(i, textScanner.b);
                textScanner.b = i;
                sb.append(strSubstring);
                throw new SVGParseException(sb.toString());
            }
            SVG.Unit unitN = textScanner.n();
            if (unitN == null) {
                unitN = SVG.Unit.d;
            }
            arrayList.add(new SVG.Length(fI, unitN));
            textScanner.p();
        }
        return arrayList;
    }

    public static SVG.Length v(TextScanner textScanner) {
        return textScanner.e(CameraSettings.FOCUS_STRATEGY_AUTO) ? new SVG.Length(BitmapDescriptorFactory.HUE_RED) : textScanner.j();
    }

    public static Float w(String str) {
        try {
            float fQ = q(str);
            float f = BitmapDescriptorFactory.HUE_RED;
            if (fQ < BitmapDescriptorFactory.HUE_RED) {
                fQ = f;
            } else {
                f = 1.0f;
                if (fQ > 1.0f) {
                    fQ = f;
                }
            }
            return Float.valueOf(fQ);
        } catch (SVGParseException unused) {
            return null;
        }
    }

    public static SVG.SvgPaint x(String str) {
        boolean zStartsWith = str.startsWith("url(");
        SVG.SvgPaint svgPaintO = SVG.Colour.f;
        SVG.SvgPaint svgPaint = SVG.CurrentColor.d;
        SVG.SvgPaint svgPaint2 = null;
        if (!zStartsWith) {
            if (str.equals(DevicePublicKeyStringDef.NONE)) {
                return svgPaintO;
            }
            if (str.equals("currentColor")) {
                return svgPaint;
            }
            try {
                return o(str);
            } catch (SVGParseException unused) {
                return null;
            }
        }
        int iIndexOf = str.indexOf(")");
        if (iIndexOf == -1) {
            return new SVG.PaintReference(str.substring(4).trim(), null);
        }
        String strTrim = str.substring(4, iIndexOf).trim();
        String strTrim2 = str.substring(iIndexOf + 1).trim();
        if (strTrim2.length() > 0) {
            if (!strTrim2.equals(DevicePublicKeyStringDef.NONE)) {
                if (strTrim2.equals("currentColor")) {
                    svgPaintO = svgPaint;
                } else {
                    try {
                        svgPaintO = o(strTrim2);
                    } catch (SVGParseException unused2) {
                        svgPaintO = null;
                    }
                }
            }
            svgPaint2 = svgPaintO;
        }
        return new SVG.PaintReference(strTrim, svgPaint2);
    }

    public static void y(SVG.SvgPreserveAspectRatioContainer svgPreserveAspectRatioContainer, String str) throws SVGParseException {
        PreserveAspectRatio.Scale scale;
        TextScanner textScanner = new TextScanner(str);
        textScanner.q();
        String strL = textScanner.l();
        if ("defer".equals(strL)) {
            textScanner.q();
            strL = textScanner.l();
        }
        PreserveAspectRatio.Alignment alignment = (PreserveAspectRatio.Alignment) AspectRatioKeywords.f14031a.get(strL);
        textScanner.q();
        if (textScanner.f()) {
            scale = null;
        } else {
            String strL2 = textScanner.l();
            strL2.getClass();
            if (strL2.equals("meet")) {
                scale = PreserveAspectRatio.Scale.d;
            } else {
                if (!strL2.equals("slice")) {
                    throw new SVGParseException("Invalid preserveAspectRatio definition: ".concat(str));
                }
                scale = PreserveAspectRatio.Scale.e;
            }
        }
        svgPreserveAspectRatioContainer.n = new PreserveAspectRatio(alignment, scale);
    }

    public static HashMap z(TextScanner textScanner) {
        HashMap map = new HashMap();
        textScanner.q();
        String strM = textScanner.m('=', false);
        while (strM != null) {
            textScanner.d('=');
            map.put(strM, textScanner.k());
            textScanner.q();
            strM = textScanner.m('=', false);
        }
        return map;
    }

    public final void B(InputStream inputStream) throws ParserConfigurationException, SAXException, IOException {
        Log.d("SVGParser", "Falling back to SAX parser");
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            SAXHandler sAXHandler = new SAXHandler();
            xMLReader.setContentHandler(sAXHandler);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", sAXHandler);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e) {
            throw new SVGParseException("Stream error", e);
        } catch (ParserConfigurationException e2) {
            throw new SVGParseException("XML parser problem", e2);
        } catch (SAXException e3) {
            throw new SVGParseException("SVG parse error", e3);
        }
    }

    public final void C(InputStream inputStream) throws XmlPullParserException, ParserConfigurationException, SAXException, IOException {
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                XPPAttributesWrapper xPPAttributesWrapper = new XPPAttributesWrapper();
                xPPAttributesWrapper.f14037a = xmlPullParserNewPullParser;
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType == 0) {
                        F();
                    } else if (eventType == 8) {
                        Log.d("SVGParser", "PROC INSTR: " + xmlPullParserNewPullParser.getText());
                        TextScanner textScanner = new TextScanner(xmlPullParserNewPullParser.getText());
                        String strL = textScanner.l();
                        z(textScanner);
                        strL.equals("xml-stylesheet");
                    } else if (eventType == 10) {
                        if (this.f14029a.f14011a == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                Log.d("SVGParser", "Switching to SAX parser to process entities");
                                inputStream.reset();
                                B(inputStream);
                                return;
                            } catch (IOException unused) {
                                Log.w("SVGParser", "Detected internal entity definitions, but could not parse them.");
                                return;
                            }
                        }
                    } else if (eventType == 2) {
                        String name = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name = xmlPullParserNewPullParser.getPrefix() + ':' + name;
                        }
                        G(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, xPPAttributesWrapper);
                    } else if (eventType == 3) {
                        String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name2 = xmlPullParserNewPullParser.getPrefix() + ':' + name2;
                        }
                        c(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        I(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                    } else if (eventType == 5) {
                        H(xmlPullParserNewPullParser.getText());
                    }
                }
            } catch (IOException e) {
                throw new SVGParseException("Stream error", e);
            }
        } catch (XmlPullParserException e2) {
            throw new SVGParseException("XML parser problem", e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0349, code lost:
    
        android.util.Log.e("SVGParser", "Bad path coords for " + ((char) r5) + " path segment");
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x035c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(org.xml.sax.Attributes r25) throws com.caverock.androidsvg.SVGParseException {
        /*
            Method dump skipped, instructions count: 966
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.D(org.xml.sax.Attributes):void");
    }

    public final void F() {
        SVG svg = new SVG();
        svg.f14011a = null;
        svg.b = new CSSParser.Ruleset();
        svg.c = new HashMap();
        this.f14029a = svg;
    }

    /* JADX WARN: Code restructure failed: missing block: B:627:0x0106, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:658:0x04a9, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:685:0x0672, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:699:0x0736, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:734:0x0979, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:762:0x0bc9, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(java.lang.String r17, java.lang.String r18, java.lang.String r19, org.xml.sax.Attributes r20) throws com.caverock.androidsvg.SVGParseException {
        /*
            Method dump skipped, instructions count: 3214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.G(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes):void");
    }

    public final void H(String str) {
        if (this.c) {
            return;
        }
        if (this.e) {
            if (this.g == null) {
                this.g = new StringBuilder(str.length());
            }
            this.g.append(str);
        } else if (this.h) {
            if (this.i == null) {
                this.i = new StringBuilder(str.length());
            }
            this.i.append(str);
        } else if (this.b instanceof SVG.TextContainer) {
            a(str);
        }
    }

    public final void I(char[] cArr, int i, int i2) {
        if (this.c) {
            return;
        }
        if (this.e) {
            if (this.g == null) {
                this.g = new StringBuilder(i2);
            }
            this.g.append(cArr, i, i2);
        } else if (this.h) {
            if (this.i == null) {
                this.i = new StringBuilder(i2);
            }
            this.i.append(cArr, i, i2);
        } else if (this.b instanceof SVG.TextContainer) {
            a(new String(cArr, i, i2));
        }
    }

    public final void a(String str) {
        SVG.SvgConditionalContainer svgConditionalContainer = (SVG.SvgConditionalContainer) this.b;
        int size = svgConditionalContainer.i.size();
        SVG.SvgObject svgObject = size == 0 ? null : (SVG.SvgObject) svgConditionalContainer.i.get(size - 1);
        if (svgObject instanceof SVG.TextSequence) {
            SVG.TextSequence textSequence = (SVG.TextSequence) svgObject;
            textSequence.c = YU.a.o(new StringBuilder(), textSequence.c, str);
        } else {
            SVG.SvgContainer svgContainer = this.b;
            SVG.TextSequence textSequence2 = new SVG.TextSequence();
            textSequence2.c = str;
            svgContainer.h(textSequence2);
        }
    }

    public final void c(String str, String str2, String str3) {
        if (this.c) {
            int i = this.d - 1;
            this.d = i;
            if (i == 0) {
                this.c = false;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            SVGElem sVGElem = (SVGElem) SVGElem.h.get(str2);
            if (sVGElem == null) {
                sVGElem = SVGElem.g;
            }
            switch (sVGElem.ordinal()) {
                case 0:
                case 3:
                case 4:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 14:
                case 17:
                case 19:
                case 20:
                case 22:
                case 23:
                case 24:
                case 25:
                case 28:
                case 29:
                case 30:
                    this.b = ((SVG.SvgObject) this.b).b;
                    break;
                case 5:
                case 26:
                    this.e = false;
                    if (this.g != null) {
                        SVGElem sVGElem2 = this.f;
                        if (sVGElem2 == SVGElem.f || sVGElem2 == SVGElem.d) {
                            this.f14029a.getClass();
                        }
                        this.g.setLength(0);
                        break;
                    }
                    break;
                case 21:
                    StringBuilder sb = this.i;
                    if (sb != null) {
                        this.h = false;
                        String string = sb.toString();
                        CSSParser cSSParser = new CSSParser(CSSParser.Source.d);
                        SVG svg = this.f14029a;
                        CSSParser.CSSTextScanner cSSTextScanner = new CSSParser.CSSTextScanner(string);
                        cSSTextScanner.q();
                        svg.b.b(cSSParser.e(cSSTextScanner));
                        this.i.setLength(0);
                        break;
                    }
                    break;
            }
        }
    }

    public final SVG f(InputStream inputStream) throws IOException {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int i = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (i == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            inputStream.mark(4096);
            C(inputStream);
            return this.f14029a;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }
}
