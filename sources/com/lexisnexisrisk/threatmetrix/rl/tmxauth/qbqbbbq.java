package com.lexisnexisrisk.threatmetrix.rl.tmxauth;

import android.annotation.TargetApi;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import com.lexisnexisrisk.threatmetrix.rl.TMXStrongAuth;
import com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqbbqbq;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class qbqbbbq {
    public static int a0061aaa00610061 = 2;
    public static int aa006100610061a0061 = 71;
    public static int aaaaa00610061 = 1;
    private static final String w00770077www0077;

    static {
        int i = aa006100610061a0061;
        if (((a00610061aa00610061() + i) * i) % a0061aaa00610061 != 0) {
            aa006100610061a0061 = 35;
            aaaaa00610061 = aa0061aa00610061();
        }
        w00770077www0077 = qqbbqbq.b0062b006200620062b(qbqbbbq.class);
    }

    private qbqbbbq() {
    }

    public static int a0061006100610061a0061() {
        return 0;
    }

    public static int a00610061aa00610061() {
        return 1;
    }

    public static int aa0061aa00610061() {
        return 28;
    }

    @TargetApi
    public static TMXStrongAuth.AuthenticationStatus b0062bbb00620062(Context context, String str, String str2, @Nullable TMXStrongAuth.StrongAuthCallback strongAuthCallback) {
        if (strongAuthCallback == null) {
            qqbbqbq.qbbbqbq.d(w00770077www0077, qqqqbbb.q0071007100710071q0071("B%\u0015\f w~\u0005P`X\u0007^\u0006d.@ENSivRU\\K\u0007\u0003~\u0001\u0001\u0003]\u0001kLFTvYA@IF/J(OQLx@BM\u0019Rm\u001e{+^OeU]p#\u001c=]\u0018_\u000e\u001e<8\u001c\"+&\u0014f7v", (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710759)), (char) (qbbqqbb.qqq007100710071q() ^ (-321957305)), (char) (qqqbqbb.q00710071007100710071q() ^ 1589694664)));
            return TMXStrongAuth.AuthenticationStatus.TMX_STRONG_AUTH_NOT_POSSIBLE;
        }
        Object systemService = context.getSystemService(qqqqbbb.q0071q00710071q0071("\u000b5G\u0012\u0010&_q", (char) (qqbqqbb.q0071qq00710071q() ^ 2118014540), (char) (qbbqqbb.qqq007100710071q() ^ (-321957266))));
        if (!(systemService instanceof KeyguardManager)) {
            String str3 = w00770077www0077;
            char cQ00710071007100710071q = (char) (qqqbqbb.q00710071007100710071q() ^ 1589694534);
            char cQq00710071q0071q = (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710715));
            int i = aa006100610061a0061;
            if (((aaaaa00610061 + i) * i) % a0061aaa00610061 != a0061006100610061a0061()) {
                aa006100610061a0061 = aa0061aa00610061();
                aaaaa00610061 = aa0061aa00610061();
            }
            qqbbqbq.qbbbqbq.d(str3, qqqqbbb.q0071007100710071q0071("h\u001e\u001e\u0013\u0011\u001b\"\u0018\u0013\u0012&\u001c##U\u001d\u0019\"&0.\"w^)/8$0.*f3.C2A.@3oD7EJ>9<\u0004xL@PRPMIOI\u000382>F;=<::4M0EE:RBDJVHHMNE?JD", cQ00710071007100710071q, cQq00710071q0071q, (char) (qqqbqbb.q00710071007100710071q() ^ 1589694671)));
            return TMXStrongAuth.AuthenticationStatus.TMX_STRONG_AUTH_NOT_POSSIBLE;
        }
        Intent intentCreateConfirmDeviceCredentialIntent = ((KeyguardManager) systemService).createConfirmDeviceCredentialIntent(str, str2);
        if (intentCreateConfirmDeviceCredentialIntent == null) {
            qqbbqbq.qbbbqbq.d(w00770077www0077, qqqqbbb.q0071007100710071q0071("Hl\u0015\u0013@Ny+ S\u0003H5->\u001b}=1\u001f/\u000bjv\b\u001aK3\u0006Z/\u0014*]Yk\u0011>\u001cbji\u0004B\u00065=P<Vw $l\u0003\u0001\u001cxtd4\u00146rtdX_W\u0005t\u0012qW.\u0011_1Dn\u0005\u000f\nZ1\fOJ\u001bM\u000eufcp\u000f\u001d3^m", (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710880)), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710893)), (char) (qbbqqbb.qqq007100710071q() ^ (-321957275))));
            return TMXStrongAuth.AuthenticationStatus.TMX_STRONG_AUTH_NOT_POSSIBLE;
        }
        try {
            int iCallIntent = strongAuthCallback.callIntent(intentCreateConfirmDeviceCredentialIntent);
            if (iCallIntent == -1) {
                return TMXStrongAuth.AuthenticationStatus.TMX_STRONG_AUTH_OK;
            }
            if (iCallIntent == 0) {
                qqbbqbq.qbbbqbq.d(w00770077www0077, qqqqbbb.q0071q00710071q0071("Y\r\u000b}y\u0002\u0007zsp\u0003v{y*oiprzvh<!urco\u001c^[g[\\baYW\u0012RecVRZ_SLI[OTR", (char) (qqbqqbb.q0071qq00710071q() ^ 2118014629), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710745))));
                return TMXStrongAuth.AuthenticationStatus.TMX_STRONG_AUTH_CANCELLED;
            }
            qqbbqbq.qbbbqbq.d(w00770077www0077, qqqqbbb.q0071q00710071q0071("W\r\r\u0002\u007f\n\u0011\u0007\u0002\u0001\u0015\u000b\u0012\u0012D\f\b\u0011\u0015\u001f\u001d\u0011fM\"$\u0016\"\b$T)+\u0019-/.[&1^", (char) (qqbqqbb.q0071qq00710071q() ^ 2118014681), (char) (qqqbqbb.q00710071007100710071q() ^ 1589694666)) + iCallIntent);
            return TMXStrongAuth.AuthenticationStatus.TMX_STRONG_AUTH_FAILED;
        } catch (Throwable th) {
            qqbbqbq.e(w00770077www0077, qqqqbbb.q0071007100710071q0071("bzp\u0003ymjzjh#gycdnqejh\u0019gZYjfeWU\u0010fVRZ\u000bMJTSOSK\u0003EBLK'KP@HMwD;I<B6p", (char) (qbbqqbb.qqq007100710071q() ^ (-321957257)), (char) (qbbqqbb.qqq007100710071q() ^ (-321957242)), (char) (qbbqqbb.qqq007100710071q() ^ (-321957274))) + th.toString());
            return TMXStrongAuth.AuthenticationStatus.TMX_STRONG_AUTH_FAILED;
        }
    }
}
