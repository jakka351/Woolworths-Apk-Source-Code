package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import android.content.SharedPreferences;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnlllnn;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class lllqqql {
    public static final String c0063006300630063cc = "TMX_MERGED_PERF_KEY";
    public static final String c006300630063ccc = "SHENASE_D";
    public static final String c00630063c0063cc = "enableOptions";
    public static final String c0063c00630063cc = "quietPeriod";
    public static final String c0063c0063ccc = "ThreatMetrixMobileSDK";
    public static final String c0063cc0063cc = "SHENASE_S";
    public static final String c0063ccc0063c = "|";
    private static final String c0063ccccc = lqlqqll.u00750075u00750075u(lllqqql.class);
    public static final String cc006300630063cc = "sdkVersion";
    public static final String cc00630063ccc = "ThreatMetrixMobileSDK";
    public static final String cc0063c0063cc = "SHENASE_A";
    public static final String ccc00630063cc = "disableOptions";
    public static final String cccc0063cc = "SHENASE_H";
    public static final String ccccc0063c = " rl";
    private static final int r007200720072r00720072 = 3;
    private static final int r00720072r007200720072 = 7;
    private static final int r0072r0072007200720072 = 1;
    private static final int r0072r0072r00720072 = 1;
    private static final int r0072rr007200720072 = 5;
    private static final int rr00720072007200720072 = 9;
    private static final int rr00720072r00720072 = 2;
    private static final int rr0072r007200720072 = 6;
    private static final int rrr0072007200720072 = 8;
    private static final int rrr0072r00720072 = 0;
    private static final int rrrr007200720072 = 4;

    @Nullable
    private final nlllnnl c00630063cccc;

    @Nullable
    private volatile String cc0063cccc;

    @Nullable
    private volatile String ccc0063ccc;
    private long cc0063cc0063c = 0;
    private long c00630063cc0063c = 0;
    private String ccc0063c0063c = null;
    private int c0063c0063c0063c = 0;
    private String cc00630063c0063c = null;
    private String c006300630063c0063c = null;
    private String cccc00630063c = null;
    private String c0063cc00630063c = null;
    private String cc0063c00630063c = null;
    private boolean c00630063c00630063c = false;

    public lllqqql(@Nonnull nlllnnl nlllnnlVar, @Nonnull String str) {
        this.cc0063cccc = null;
        this.c00630063cccc = nlllnnlVar;
        this.ccc0063ccc = str;
        if (nlllnnlVar == null || llqllqq.ggggggg0067(this.ccc0063ccc)) {
            return;
        }
        this.cc0063cccc = nlllnnlVar.ddddd0064d() + "TDM" + str;
    }

    public void j006A006A006A006A006Aj() {
        this.cc0063cc0063c = 0L;
        this.c00630063cc0063c = 0L;
        this.ccc0063c0063c = null;
        this.c0063c0063c0063c = 0;
        this.cc00630063c0063c = null;
        this.c006300630063c0063c = null;
        this.cccc00630063c = null;
        this.c0063cc00630063c = null;
        this.cc0063c00630063c = null;
    }

    public String j006A006Aj006A006Aj(String str) {
        if (llqllqq.ggggggg0067(str)) {
            return null;
        }
        str.getClass();
        switch (str) {
        }
        return null;
    }

    public synchronized boolean j006A006Ajjj006A(String str, String str2) {
        try {
            boolean z = false;
            if (!llqllqq.ggggggg0067(str) && str2 != null) {
                switch (str.hashCode()) {
                    case -1962630338:
                        if (str.equals(cc006300630063cc)) {
                            String str3 = this.ccc0063c0063c;
                            if (str3 == null || (llqllqq.g006700670067006700670067g(str3) && !this.ccc0063c0063c.equals(str2))) {
                                this.ccc0063c0063c = str2;
                                this.c00630063c00630063c = true;
                            }
                            z = true;
                        }
                        return z;
                    case -89133479:
                        if (str.equals("ThreatMetrixMobileSDK")) {
                            String str4 = this.cc0063c00630063c;
                            if (str4 == null || (llqllqq.g006700670067006700670067g(str4) && !this.cc0063c00630063c.equals(str2))) {
                                this.cc0063c00630063c = str2;
                                this.c00630063c00630063c = true;
                            }
                            z = true;
                        }
                        return z;
                    case 342316631:
                        if (str.equals(cc0063c0063cc)) {
                            String str5 = this.cc00630063c0063c;
                            if (str5 == null || (llqllqq.g006700670067006700670067g(str5) && !this.cc00630063c0063c.equals(str2))) {
                                this.cc00630063c0063c = str2;
                                this.c00630063c00630063c = true;
                            }
                            z = true;
                        }
                        return z;
                    case 342316634:
                        if (str.equals(c006300630063ccc)) {
                            String str6 = this.c006300630063c0063c;
                            if (str6 == null || (llqllqq.g006700670067006700670067g(str6) && !this.c006300630063c0063c.equals(str2))) {
                                this.c006300630063c0063c = str2;
                                this.c00630063c00630063c = true;
                            }
                            z = true;
                        }
                        return z;
                    case 342316638:
                        if (str.equals(cccc0063cc)) {
                            String str7 = this.cccc00630063c;
                            if (str7 == null || (llqllqq.g006700670067006700670067g(str7) && !this.cccc00630063c.equals(str2))) {
                                this.cccc00630063c = str2;
                                this.c00630063c00630063c = true;
                            }
                            z = true;
                        }
                        return z;
                    case 342316649:
                        if (str.equals(c0063cc0063cc)) {
                            String str8 = this.c0063cc00630063c;
                            if (str8 != null) {
                                if (llqllqq.g006700670067006700670067g(str8) && !this.c0063cc00630063c.equals(str2)) {
                                }
                                z = true;
                            }
                            this.c0063cc00630063c = str2;
                            this.c00630063c00630063c = true;
                            z = true;
                        }
                        return z;
                    default:
                        return z;
                }
            }
            return false;
        } finally {
        }
    }

    public synchronized boolean j006Aj006A006A006Aj() {
        String str;
        if (nnlllnn.nllllln.f00660066f0066f0066() && this.c00630063cccc != null && !llqllqq.ggggggg0067(this.cc0063cccc) && !llqllqq.ggggggg0067(this.ccc0063ccc)) {
            SharedPreferences sharedPreferences = this.c00630063cccc.ww0077w007700770077.getSharedPreferences(this.cc0063cccc, 0);
            if (!nnlllnn.nllllln.f00660066fff0066(sharedPreferences, c0063006300630063cc)) {
                return false;
            }
            try {
                String strF0066ff0066f0066 = nnlllnn.nllllln.f0066ff0066f0066(sharedPreferences, c0063006300630063cc, "");
                if (llqllqq.ggggggg0067(strF0066ff0066f0066)) {
                    return false;
                }
                String strJjjj006Aj006A = lqlqqql.jjjj006Aj006A(strF0066ff0066f0066, this.ccc0063ccc, lqlqqql.cccccc0063);
                if (llqllqq.ggggggg0067(strJjjj006Aj006A)) {
                    return false;
                }
                String[] strArrSplit = strJjjj006Aj006A.split("\\|", -1);
                if (strArrSplit.length != 9) {
                    strArrSplit = strJjjj006Aj006A.split(":", -1);
                    if (strArrSplit.length != 9 && strArrSplit.length != 10) {
                        return false;
                    }
                }
                String str2 = strArrSplit[3];
                this.ccc0063c0063c = str2;
                if (llqllqq.ggggggg0067(str2)) {
                    return false;
                }
                this.cc0063cc0063c = Long.parseLong(strArrSplit[0]);
                this.c00630063cc0063c = Long.parseLong(strArrSplit[1]);
                this.c0063c0063c0063c = Integer.parseInt(strArrSplit[2]);
                if (strArrSplit.length == 10 && strArrSplit[4].equalsIgnoreCase(ccccc0063c)) {
                    this.ccc0063c0063c += ": rl";
                    this.cc00630063c0063c = strArrSplit[5];
                    this.c006300630063c0063c = strArrSplit[6];
                    this.cccc00630063c = strArrSplit[7];
                    this.c0063cc00630063c = strArrSplit[8];
                    str = strArrSplit[9];
                } else {
                    this.cc00630063c0063c = strArrSplit[4];
                    this.c006300630063c0063c = strArrSplit[5];
                    this.cccc00630063c = strArrSplit[6];
                    this.c0063cc00630063c = strArrSplit[7];
                    str = strArrSplit[8];
                }
                this.cc0063c00630063c = str;
                return true;
            } catch (ClassCastException | NumberFormatException e) {
                lqlqqll.uu0075007500750075u(c0063ccccc, "read error - continue", e.toString());
                return false;
            }
        }
        return false;
    }

    public synchronized boolean j006Aj006Ajj006A() {
        nlllnnl nlllnnlVar = this.c00630063cccc;
        if (nlllnnlVar != null && nlllnnlVar.ww0077w007700770077 != null && !llqllqq.ggggggg0067(this.cc0063cccc) && !llqllqq.ggggggg0067(this.ccc0063ccc)) {
            if (nnlllnn.nllllln.f00660066fff0066(this.c00630063cccc.ww0077w007700770077.getSharedPreferences(this.cc0063cccc, 0), c0063006300630063cc) && !this.c00630063c00630063c) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.cc0063cc0063c);
            sb.append(c0063ccc0063c);
            sb.append(this.c00630063cc0063c);
            sb.append(c0063ccc0063c);
            sb.append(this.c0063c0063c0063c);
            sb.append(c0063ccc0063c);
            sb.append(llqllqq.ggggggg0067(this.ccc0063c0063c) ? "" : this.ccc0063c0063c);
            sb.append(c0063ccc0063c);
            sb.append(llqllqq.ggggggg0067(this.cc00630063c0063c) ? "" : this.cc00630063c0063c);
            sb.append(c0063ccc0063c);
            sb.append(llqllqq.ggggggg0067(this.c006300630063c0063c) ? "" : this.c006300630063c0063c);
            sb.append(c0063ccc0063c);
            sb.append(llqllqq.ggggggg0067(this.cccc00630063c) ? "" : this.cccc00630063c);
            sb.append(c0063ccc0063c);
            sb.append(llqllqq.ggggggg0067(this.c0063cc00630063c) ? "" : this.c0063cc00630063c);
            sb.append(c0063ccc0063c);
            sb.append(llqllqq.ggggggg0067(this.cc0063c00630063c) ? "" : this.cc0063c00630063c);
            String strJ006A006Aj006Aj006A = lqlqqql.j006A006Aj006Aj006A(sb.toString(), this.ccc0063ccc, lqlqqql.cccccc0063);
            if (llqllqq.ggggggg0067(strJ006A006Aj006Aj006A)) {
                return false;
            }
            nnlllnn.nllllln.fffff00660066(this.c00630063cccc, this.cc0063cccc, c0063006300630063cc, strJ006A006Aj006Aj006A);
            this.c00630063c00630063c = false;
            return true;
        }
        return false;
    }

    public int j006Ajj006A006Aj(String str) {
        if (llqllqq.ggggggg0067(str) || !str.equals(c0063c00630063cc)) {
            return 0;
        }
        return this.c0063c0063c0063c;
    }

    public synchronized boolean j006Ajjjj006A(String str, int i) {
        if (str != null) {
            if (str.equals(c0063c00630063cc)) {
                this.c0063c0063c0063c = i;
                return true;
            }
        }
        return false;
    }

    public synchronized void jj006A006A006A006Aj() {
        if (!nnlllnn.nllllln.f00660066f0066f0066()) {
            lqlqqll.u0075u0075uu0075(c0063ccccc, "Invalid state, failed to access pref");
            return;
        }
        if (this.c00630063cccc != null && !llqllqq.ggggggg0067(this.cc0063cccc)) {
            if (j006Aj006A006A006Aj()) {
                return;
            }
            if (jjj006A006A006Aj()) {
                lqlqqll.uuu007500750075u(c0063ccccc, "Found old shared preference");
                j006Aj006Ajj006A();
            }
            return;
        }
        lqlqqll.uuu007500750075u(c0063ccccc, "Invalid context or preference name");
    }

    public long jj006Aj006A006Aj(String str) {
        if (llqllqq.ggggggg0067(str)) {
            return 0L;
        }
        str.getClass();
        if (str.equals(c00630063c0063cc)) {
            return this.cc0063cc0063c;
        }
        if (str.equals(ccc00630063cc)) {
            return this.c00630063cc0063c;
        }
        return 0L;
    }

    public synchronized boolean jj006Ajjj006A(String str, long j) {
        try {
            boolean z = false;
            if (llqllqq.ggggggg0067(str)) {
                return false;
            }
            int iHashCode = str.hashCode();
            if (iHashCode != -130003045) {
                if (iHashCode == 325543574 && str.equals(ccc00630063cc)) {
                    if (this.c00630063cc0063c != j) {
                        this.c00630063cc0063c = j;
                        this.c00630063c00630063c = true;
                    }
                    z = true;
                }
            } else if (str.equals(c00630063c0063cc)) {
                if (this.cc0063cc0063c != j) {
                    this.cc0063cc0063c = j;
                    this.c00630063c00630063c = true;
                }
                z = true;
            }
            return z;
        } finally {
        }
    }

    public synchronized boolean jjj006A006A006Aj() {
        nlllnnl nlllnnlVar;
        boolean z;
        if (nnlllnn.nllllln.f00660066f0066f0066() && (nlllnnlVar = this.c00630063cccc) != null && nlllnnlVar.ww0077w007700770077 != null && !llqllqq.ggggggg0067(this.cc0063cccc)) {
            SharedPreferences sharedPreferences = this.c00630063cccc.ww0077w007700770077.getSharedPreferences("ThreatMetrixMobileSDK", 0);
            boolean z2 = true;
            if (nnlllnn.nllllln.f00660066fff0066(sharedPreferences, "ThreatMetrixMobileSDK")) {
                try {
                    this.cc0063c00630063c = nnlllnn.nllllln.f0066ff0066f0066(sharedPreferences, "ThreatMetrixMobileSDK", "");
                } catch (ClassCastException e) {
                    lqlqqll.uu0075007500750075u(c0063ccccc, "Found preference of different type", e.toString());
                }
                this.c00630063c00630063c = true;
                SharedPreferences.Editor editorFff0066ff0066 = nnlllnn.nllllln.fff0066ff0066(sharedPreferences);
                if (editorFff0066ff0066 != null) {
                    editorFff0066ff0066.remove("ThreatMetrixMobileSDK");
                    editorFff0066ff0066.apply();
                }
                z = true;
            } else {
                z = false;
            }
            SharedPreferences sharedPreferences2 = this.c00630063cccc.ww0077w007700770077.getSharedPreferences(this.cc0063cccc, 0);
            try {
                if (nnlllnn.nllllln.f00660066fff0066(sharedPreferences2, c00630063c0063cc)) {
                    this.cc0063cc0063c = nnlllnn.nllllln.f006600660066ff0066(sharedPreferences2, c00630063c0063cc, 0L);
                    z = true;
                }
                if (nnlllnn.nllllln.f00660066fff0066(sharedPreferences2, ccc00630063cc)) {
                    this.c00630063cc0063c = nnlllnn.nllllln.f006600660066ff0066(sharedPreferences2, ccc00630063cc, 0L);
                    z = true;
                }
                if (nnlllnn.nllllln.f00660066fff0066(sharedPreferences2, cc006300630063cc)) {
                    this.ccc0063c0063c = nnlllnn.nllllln.f0066ff0066f0066(sharedPreferences2, cc006300630063cc, "");
                    z = true;
                }
                if (nnlllnn.nllllln.f00660066fff0066(sharedPreferences2, c0063c00630063cc)) {
                    this.c0063c0063c0063c = nnlllnn.nllllln.f0066f0066ff0066(sharedPreferences2, c0063c00630063cc, 0);
                    z = true;
                }
                if (nnlllnn.nllllln.f00660066fff0066(sharedPreferences2, cc0063c0063cc)) {
                    this.cc00630063c0063c = nnlllnn.nllllln.f0066ff0066f0066(sharedPreferences2, cc0063c0063cc, "");
                    z = true;
                }
                if (nnlllnn.nllllln.f00660066fff0066(sharedPreferences2, c006300630063ccc)) {
                    this.c006300630063c0063c = nnlllnn.nllllln.f0066ff0066f0066(sharedPreferences2, c006300630063ccc, "");
                    z = true;
                }
                if (nnlllnn.nllllln.f00660066fff0066(sharedPreferences2, cccc0063cc)) {
                    this.cccc00630063c = nnlllnn.nllllln.f0066ff0066f0066(sharedPreferences2, cccc0063cc, "");
                    z = true;
                }
            } catch (ClassCastException e2) {
                lqlqqll.uu0075007500750075u(c0063ccccc, "Found preference of different type", e2.toString());
            }
            if (nnlllnn.nllllln.f00660066fff0066(sharedPreferences2, c0063cc0063cc)) {
                this.c0063cc00630063c = nnlllnn.nllllln.f0066ff0066f0066(sharedPreferences2, c0063cc0063cc, "");
            } else {
                z2 = z;
            }
            SharedPreferences.Editor editorFff0066ff00662 = nnlllnn.nllllln.fff0066ff0066(sharedPreferences2);
            if (editorFff0066ff00662 != null) {
                editorFff0066ff00662.remove(c00630063c0063cc);
                editorFff0066ff00662.remove(ccc00630063cc);
                editorFff0066ff00662.remove(cc006300630063cc);
                editorFff0066ff00662.remove(c0063c00630063cc);
                editorFff0066ff00662.remove(cc0063c0063cc);
                editorFff0066ff00662.remove(c0063cc0063cc);
                editorFff0066ff00662.remove(cccc0063cc);
                editorFff0066ff00662.remove(c006300630063ccc);
                editorFff0066ff00662.apply();
            }
            return z2;
        }
        return false;
    }

    public boolean jjj006Ajj006A(long j, long j2, @Nonnull String str, int i) {
        return (j == this.cc0063cc0063c && j2 == this.c00630063cc0063c && str.equals(this.ccc0063c0063c) && i == this.c0063c0063c0063c) ? false : true;
    }

    public synchronized boolean jjjjjj006A() {
        return j006Aj006Ajj006A();
    }
}
