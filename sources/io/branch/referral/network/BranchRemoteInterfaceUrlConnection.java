package io.branch.referral.network;

import YU.a;
import io.branch.referral.Branch;
import io.branch.referral.BranchLogger;
import io.branch.referral.PrefHelper;
import io.branch.referral.network.BranchRemoteInterface;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class BranchRemoteInterfaceUrlConnection extends BranchRemoteInterface {

    /* renamed from: a, reason: collision with root package name */
    public final Branch f23872a;
    public int b = -1;
    public String c = "";
    public String d = "";
    public final int e;

    public BranchRemoteInterfaceUrlConnection(Branch branch) {
        this.f23872a = branch;
        this.e = PrefHelper.d(branch.d).f23860a.getInt("bnc_retry_count", 3);
    }

    public static String h(InputStream inputStream) throws IOException {
        if (inputStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        return sb.toString();
                    }
                    sb.append(line);
                }
            } catch (IOException e) {
                BranchLogger.a(e.getMessage());
            }
        }
        return null;
    }

    @Override // io.branch.referral.network.BranchRemoteInterface
    public final BranchRemoteInterface.BranchResponse b(String str, JSONObject jSONObject) {
        return f(str, jSONObject, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00cb A[Catch: all -> 0x0085, IOException -> 0x0089, InterruptedIOException -> 0x008d, SocketTimeoutException -> 0x0092, SocketException -> 0x0097, FileNotFoundException -> 0x00c9, TRY_LEAVE, TryCatch #11 {FileNotFoundException -> 0x00c9, blocks: (B:40:0x00b5, B:42:0x00bb, B:45:0x00cb), top: B:87:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.branch.referral.network.BranchRemoteInterface.BranchResponse e(int r11, java.lang.String r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.network.BranchRemoteInterfaceUrlConnection.e(int, java.lang.String):io.branch.referral.network.BranchRemoteInterface$BranchResponse");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0282 A[Catch: all -> 0x0097, TryCatch #28 {all -> 0x0097, blocks: (B:12:0x008c, B:29:0x0102, B:33:0x0113, B:32:0x010c, B:39:0x0130, B:41:0x0136, B:100:0x0277, B:102:0x0282, B:103:0x0292, B:104:0x0293, B:105:0x029e, B:106:0x029f, B:108:0x02a8, B:112:0x02b9, B:116:0x02c8, B:117:0x02d3, B:111:0x02b2, B:118:0x02d4, B:120:0x02dd, B:124:0x02ee, B:128:0x02fd, B:129:0x0308, B:123:0x02e7, B:130:0x0309, B:132:0x0312, B:136:0x0323, B:140:0x0332, B:141:0x033d, B:135:0x031c), top: B:159:0x005e, inners: #13, #16, #25 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0293 A[Catch: all -> 0x0097, TryCatch #28 {all -> 0x0097, blocks: (B:12:0x008c, B:29:0x0102, B:33:0x0113, B:32:0x010c, B:39:0x0130, B:41:0x0136, B:100:0x0277, B:102:0x0282, B:103:0x0292, B:104:0x0293, B:105:0x029e, B:106:0x029f, B:108:0x02a8, B:112:0x02b9, B:116:0x02c8, B:117:0x02d3, B:111:0x02b2, B:118:0x02d4, B:120:0x02dd, B:124:0x02ee, B:128:0x02fd, B:129:0x0308, B:123:0x02e7, B:130:0x0309, B:132:0x0312, B:136:0x0323, B:140:0x0332, B:141:0x033d, B:135:0x031c), top: B:159:0x005e, inners: #13, #16, #25 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02c8 A[Catch: all -> 0x0097, TRY_ENTER, TryCatch #28 {all -> 0x0097, blocks: (B:12:0x008c, B:29:0x0102, B:33:0x0113, B:32:0x010c, B:39:0x0130, B:41:0x0136, B:100:0x0277, B:102:0x0282, B:103:0x0292, B:104:0x0293, B:105:0x029e, B:106:0x029f, B:108:0x02a8, B:112:0x02b9, B:116:0x02c8, B:117:0x02d3, B:111:0x02b2, B:118:0x02d4, B:120:0x02dd, B:124:0x02ee, B:128:0x02fd, B:129:0x0308, B:123:0x02e7, B:130:0x0309, B:132:0x0312, B:136:0x0323, B:140:0x0332, B:141:0x033d, B:135:0x031c), top: B:159:0x005e, inners: #13, #16, #25 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02fd A[Catch: all -> 0x0097, TRY_ENTER, TryCatch #28 {all -> 0x0097, blocks: (B:12:0x008c, B:29:0x0102, B:33:0x0113, B:32:0x010c, B:39:0x0130, B:41:0x0136, B:100:0x0277, B:102:0x0282, B:103:0x0292, B:104:0x0293, B:105:0x029e, B:106:0x029f, B:108:0x02a8, B:112:0x02b9, B:116:0x02c8, B:117:0x02d3, B:111:0x02b2, B:118:0x02d4, B:120:0x02dd, B:124:0x02ee, B:128:0x02fd, B:129:0x0308, B:123:0x02e7, B:130:0x0309, B:132:0x0312, B:136:0x0323, B:140:0x0332, B:141:0x033d, B:135:0x031c), top: B:159:0x005e, inners: #13, #16, #25 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0332 A[Catch: all -> 0x0097, TRY_ENTER, TryCatch #28 {all -> 0x0097, blocks: (B:12:0x008c, B:29:0x0102, B:33:0x0113, B:32:0x010c, B:39:0x0130, B:41:0x0136, B:100:0x0277, B:102:0x0282, B:103:0x0292, B:104:0x0293, B:105:0x029e, B:106:0x029f, B:108:0x02a8, B:112:0x02b9, B:116:0x02c8, B:117:0x02d3, B:111:0x02b2, B:118:0x02d4, B:120:0x02dd, B:124:0x02ee, B:128:0x02fd, B:129:0x0308, B:123:0x02e7, B:130:0x0309, B:132:0x0312, B:136:0x0323, B:140:0x0332, B:141:0x033d, B:135:0x031c), top: B:159:0x005e, inners: #13, #16, #25 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0312 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x018a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r15v12, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r15v13, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r15v15, types: [java.net.HttpURLConnection, java.net.URLConnection, javax.net.ssl.HttpsURLConnection] */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.branch.referral.network.BranchRemoteInterface.BranchResponse f(java.lang.String r20, org.json.JSONObject r21, int r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 839
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.network.BranchRemoteInterfaceUrlConnection.f(java.lang.String, org.json.JSONObject, int):io.branch.referral.network.BranchRemoteInterface$BranchResponse");
    }

    public final String g(int i, Exception exc, String str) {
        StringBuilder sbU = a.u("Branch Networking Error: \nURL: ", str, "\nResponse Code: ");
        sbU.append(this.b);
        sbU.append("\nResponse Message: ");
        sbU.append(this.c);
        sbU.append("\nCaught exception type: ");
        sbU.append(exc.getClass().getCanonicalName());
        sbU.append("\nRetry number: ");
        sbU.append(i);
        sbU.append("\nrequestId: ");
        sbU.append(this.d);
        sbU.append("\nFinal attempt: ");
        sbU.append(i >= this.e);
        sbU.append("\nObject: ");
        sbU.append(this);
        sbU.append("\nException Message: ");
        sbU.append(exc.getMessage());
        sbU.append("\nStacktrace: ");
        sbU.append(BranchLogger.d(exc));
        return sbU.toString();
    }

    public final void i() {
        this.d = "";
        this.b = -1;
        this.c = "";
    }
}
