package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import android.annotation.TargetApi;
import android.content.Context;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrength;
import android.telephony.TelephonyManager;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlllll;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnlllnn;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class nnnllnn {
    private static final String s0073ss0073ss = lqlqqll.u00750075u00750075u(nnnllnn.class);
    private static final int ss0073s0073ss = -1;

    /* renamed from: com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnnllnn$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] s00730073s0073ss;

        static {
            int[] iArr = new int[lqlllll.lllqlll.values().length];
            s00730073s0073ss = iArr;
            try {
                iArr[lqlllll.lllqlll.WCDMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                s00730073s0073ss[lqlllll.lllqlll.GSM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                s00730073s0073ss[lqlllll.lllqlll.LTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                s00730073s0073ss[lqlllll.lllqlll.CDMA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0015 A[SYNTHETIC] */
    @android.annotation.TargetApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Map<java.lang.String, java.lang.String> o006F006F006F006Fo006F(@javax.annotation.Nonnull android.content.Context r5) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.List r5 = oo006F006F006Fo006F(r5)
            if (r5 == 0) goto L87
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L87
            java.util.Iterator r5 = r5.iterator()
        L15:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L87
            java.lang.Object r1 = r5.next()
            android.telephony.CellInfo r1 = (android.telephony.CellInfo) r1
            boolean r2 = r1.isRegistered()
            if (r2 == 0) goto L15
            int[] r2 = com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnnllnn.AnonymousClass1.s00730073s0073ss
            com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlllll$lllqlll r3 = ooo006F006Fo006F(r1)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 1
            r4 = 3
            if (r2 == r3) goto L70
            r3 = 2
            if (r2 == r3) goto L61
            if (r2 == r4) goto L52
            r3 = 4
            if (r2 == r3) goto L40
            goto L7f
        L40:
            android.telephony.CellInfoCdma r1 = (android.telephony.CellInfoCdma) r1
            android.telephony.CellSignalStrengthCdma r2 = r1.getCellSignalStrength()
            android.telephony.CellIdentityCdma r1 = r1.getCellIdentity()
            java.lang.String r1 = r1.toString()
        L4e:
            o006F006Fo006Fo006F(r2, r1, r0)
            goto L7f
        L52:
            android.telephony.CellInfoLte r1 = (android.telephony.CellInfoLte) r1
            android.telephony.CellSignalStrengthLte r2 = r1.getCellSignalStrength()
            android.telephony.CellIdentityLte r1 = r1.getCellIdentity()
            java.lang.String r1 = r1.toString()
            goto L4e
        L61:
            android.telephony.CellInfoGsm r1 = (android.telephony.CellInfoGsm) r1
            android.telephony.CellSignalStrengthGsm r2 = r1.getCellSignalStrength()
            android.telephony.CellIdentityGsm r1 = r1.getCellIdentity()
            java.lang.String r1 = r1.toString()
            goto L4e
        L70:
            android.telephony.CellInfoWcdma r1 = (android.telephony.CellInfoWcdma) r1
            android.telephony.CellSignalStrengthWcdma r2 = r1.getCellSignalStrength()
            android.telephony.CellIdentityWcdma r1 = r1.getCellIdentity()
            java.lang.String r1 = r1.toString()
            goto L4e
        L7f:
            int r1 = r0.size()
            if (r1 >= r4) goto L15
            r5 = 0
            return r5
        L87:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnnllnn.o006F006F006F006Fo006F(android.content.Context):java.util.Map");
    }

    @TargetApi
    private static void o006F006Fo006Fo006F(@Nonnull CellSignalStrength cellSignalStrength, String str, @Nonnull Map<String, String> map) {
        if (cellSignalStrength.getAsuLevel() != 99) {
            map.put(lqlllll.lqqllll.k006Bkk006B006B006B, String.valueOf(cellSignalStrength.getAsuLevel()));
        }
        map.put(lqlllll.lqqllll.kkkk006B006B006B, String.valueOf(cellSignalStrength.getDbm()));
        map.put(lqlllll.lqqllll.kk006Bk006B006B006B, String.valueOf(cellSignalStrength.getLevel()));
        map.put(lqlllll.lqqllll.kk006B006B006B006B006B, str);
    }

    @TargetApi
    public static String o006Fo006F006Fo006F(@Nonnull Context context) {
        lqlllll.lllqlll lllqlllVar;
        int cid;
        int mcc;
        int mnc;
        int lac;
        StringBuilder sb = new StringBuilder();
        List<CellInfo> listOo006F006F006Fo006F = oo006F006F006Fo006F(context);
        lqlllll.lllqlll lllqlllVarOoo006F006Fo006F = lqlllll.lllqlll.LTE;
        if (listOo006F006F006Fo006F != null && !listOo006F006F006Fo006F.isEmpty()) {
            boolean z = true;
            for (CellInfo cellInfo : listOo006F006F006Fo006F) {
                if (cellInfo.isRegistered()) {
                    lllqlllVar = lllqlllVarOoo006F006Fo006F;
                    lllqlllVarOoo006F006Fo006F = ooo006F006Fo006F(cellInfo);
                    if (z) {
                        z = false;
                    } else if (lllqlllVar.getPriority() <= lllqlllVarOoo006F006Fo006F.getPriority()) {
                    }
                    boolean z2 = z;
                    int i = AnonymousClass1.s00730073s0073ss[lllqlllVarOoo006F006Fo006F.ordinal()];
                    if (i == 1) {
                        CellIdentityWcdma cellIdentity = ((CellInfoWcdma) cellInfo).getCellIdentity();
                        cid = cellIdentity.getCid();
                        mcc = cellIdentity.getMcc();
                        mnc = cellIdentity.getMnc();
                        lac = cellIdentity.getLac();
                    } else if (i == 2) {
                        CellIdentityGsm cellIdentity2 = ((CellInfoGsm) cellInfo).getCellIdentity();
                        cid = cellIdentity2.getCid();
                        mcc = cellIdentity2.getMcc();
                        mnc = cellIdentity2.getMnc();
                        lac = cellIdentity2.getLac();
                    } else if (i != 3) {
                        if (i == 4) {
                            CellIdentityCdma cellIdentity3 = ((CellInfoCdma) cellInfo).getCellIdentity();
                            cid = cellIdentity3.getBasestationId();
                            mnc = cellIdentity3.getSystemId();
                            lac = cellIdentity3.getNetworkId();
                            mcc = -1;
                        }
                        z = z2;
                    } else {
                        CellIdentityLte cellIdentity4 = ((CellInfoLte) cellInfo).getCellIdentity();
                        cid = cellIdentity4.getCi();
                        mcc = cellIdentity4.getMcc();
                        mnc = cellIdentity4.getMnc();
                        lac = cellIdentity4.getTac();
                    }
                    oo006Fo006Fo006F(lllqlllVarOoo006F006Fo006F, cid, mnc, mcc, lac, sb);
                    z = z2;
                } else {
                    lllqlllVar = lllqlllVarOoo006F006Fo006F;
                }
                lllqlllVarOoo006F006Fo006F = lllqlllVar;
            }
        }
        return sb.toString();
    }

    @Nullable
    @TargetApi
    private static List<CellInfo> oo006F006F006Fo006F(@Nonnull Context context) {
        if (!nnlllnn.nnlnnnl.ff00660066006600660066()) {
            return null;
        }
        try {
            Object systemService = context.getSystemService("phone");
            if (systemService instanceof TelephonyManager) {
                return ((TelephonyManager) systemService).getAllCellInfo();
            }
            return null;
        } catch (SecurityException e) {
            lqlqqll.llqqqll.u0075uuuuu(s0073ss0073ss, "User refuse granting permission {}", e.toString());
            nlnnlnl.d00640064dd0064d(e);
            return null;
        } catch (Exception e2) {
            lqlqqll.uuu007500750075u(s0073ss0073ss, e2.toString());
            return null;
        }
    }

    private static void oo006Fo006Fo006F(lqlllll.lllqlll lllqlllVar, int i, int i2, int i3, int i4, StringBuilder sb) {
        if (ooooo006F006F(i, i2, i3, i4)) {
            sb.append(lllqlllVar);
            sb.append(":");
            if (i != -1) {
                sb.append(i);
                sb.append(":");
            }
            if (i3 != -1) {
                sb.append(i3);
                sb.append(":");
            }
            if (i2 != -1) {
                sb.append(i2);
                sb.append(":");
            }
            if (i4 != -1) {
                sb.append(i4);
            }
        }
    }

    @Nonnull
    private static lqlllll.lllqlll ooo006F006Fo006F(CellInfo cellInfo) {
        return (nnlllnn.nnlnnnl.ffff006600660066() && (cellInfo instanceof CellInfoWcdma)) ? lqlllll.lllqlll.WCDMA : (nnlllnn.nnlnnnl.ff00660066f00660066() && (cellInfo instanceof CellInfoGsm)) ? lqlllll.lllqlll.GSM : (nnlllnn.nnlnnnl.f006600660066f00660066() && (cellInfo instanceof CellInfoLte)) ? lqlllll.lllqlll.LTE : (nnlllnn.nnlnnnl.f0066f0066f00660066() && (cellInfo instanceof CellInfoCdma)) ? lqlllll.lllqlll.CDMA : lqlllll.lllqlll.UNKOWN;
    }

    private static boolean ooooo006F006F(int i, int i2, int i3, int i4) {
        return (i == Integer.MAX_VALUE || i3 == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE || i4 == Integer.MAX_VALUE) ? false : true;
    }
}
