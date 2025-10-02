package com.adobe.mobile;

import com.dynatrace.android.callback.Callback;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.salesforce.marketingcloud.sfmcsdk.components.http.Request;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes4.dex */
final class RequestHandler {

    /* renamed from: com.adobe.mobile.RequestHandler$1, reason: invalid class name */
    final class AnonymousClass1 implements Callable<Map<String, String>> {
        @Override // java.util.concurrent.Callable
        public final Map<String, String> call() {
            return null;
        }
    }

    public interface HeaderCallback {
    }

    public static HttpURLConnection a(String str) throws IOException {
        try {
            URL url = new URL(str);
            String protocol = url.getProtocol();
            if (protocol == null) {
                return null;
            }
            if (protocol.startsWith("https")) {
                URLConnection uRLConnectionOpenConnection = url.openConnection();
                Callback.v(uRLConnectionOpenConnection);
                return (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(uRLConnectionOpenConnection));
            }
            if (!protocol.startsWith("http")) {
                return null;
            }
            URLConnection uRLConnectionOpenConnection2 = url.openConnection();
            Callback.v(uRLConnectionOpenConnection2);
            return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(uRLConnectionOpenConnection2));
        } catch (Exception e) {
            StaticMethods.J("Adobe Mobile - Exception opening URL (%s)", e.getLocalizedMessage());
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0166 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0141 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x017e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0119 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0179  */
    /* JADX WARN: Type inference failed for: r11v0, types: [int] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] b(int r10, int r11, java.lang.String r12, java.lang.String r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.mobile.RequestHandler.b(int, int, java.lang.String, java.lang.String):byte[]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v30, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v34, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v41, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v45, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v52, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v56, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v60 */
    /* JADX WARN: Type inference failed for: r6v63, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v64 */
    /* JADX WARN: Type inference failed for: r6v67, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v68 */
    /* JADX WARN: Type inference failed for: r6v72 */
    /* JADX WARN: Type inference failed for: r6v73 */
    /* JADX WARN: Type inference failed for: r6v76, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v79, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v80 */
    /* JADX WARN: Type inference failed for: r6v81 */
    /* JADX WARN: Type inference failed for: r6v82 */
    /* JADX WARN: Type inference failed for: r6v83 */
    /* JADX WARN: Type inference failed for: r6v84 */
    /* JADX WARN: Type inference failed for: r6v85 */
    /* JADX WARN: Type inference failed for: r6v86 */
    /* JADX WARN: Type inference failed for: r6v87 */
    /* JADX WARN: Type inference failed for: r6v88 */
    /* JADX WARN: Type inference failed for: r6v89 */
    /* JADX WARN: Type inference failed for: r6v90 */
    /* JADX WARN: Type inference failed for: r6v91 */
    /* JADX WARN: Type inference failed for: r6v92 */
    /* JADX WARN: Type inference failed for: r6v93 */
    /* JADX WARN: Type inference failed for: r6v94 */
    /* JADX WARN: Type inference failed for: r6v95 */
    /* JADX WARN: Type inference failed for: r6v96 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.io.InputStreamReader, java.io.Reader] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.io.InputStreamReader] */
    public static NetworkObject c(String str, String str2, String str3, String str4, String str5, int i, String str6) throws Throwable {
        ?? A = a(str);
        BufferedReader bufferedReader = null;
        if (A == 0) {
            return null;
        }
        NetworkObject networkObject = new NetworkObject();
        try {
            try {
                A.setRequestMethod(str2);
                int i2 = i * 1000;
                A.setReadTimeout(i2);
                A.setConnectTimeout(i2);
                if (str5 != null && !str5.isEmpty()) {
                    A.setRequestProperty(me.oriient.internal.infra.rest.RequestBuilder.CONTENT_TYPE, str5);
                }
                if (str3 != 0 && !str3.isEmpty()) {
                    A.setRequestProperty(me.oriient.internal.infra.rest.RequestBuilder.ACCEPT, str3);
                }
                A.setRequestProperty("Accept-Encoding", "identity");
                A.setRequestProperty("Accept-Language", StaticMethods.s());
                A.setRequestProperty("User-Agent", StaticMethods.u());
                if (str2.equalsIgnoreCase("POST") || str2.equalsIgnoreCase(Request.PUT)) {
                    A.setDoOutput(true);
                }
                if (str4 != 0 && !str4.isEmpty()) {
                    byte[] bytes = str4.getBytes("UTF-8");
                    A.setFixedLengthStreamingMode(bytes.length);
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(Callback.d(A));
                    bufferedOutputStream.write(bytes);
                    bufferedOutputStream.close();
                }
                networkObject.f13277a = Callback.f(A);
                str3 = Callback.a(A);
                try {
                    str4 = new InputStreamReader((InputStream) str3, "UTF-8");
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(str4);
                        try {
                            StringBuilder sb = new StringBuilder();
                            while (true) {
                                String line = bufferedReader2.readLine();
                                if (line == null) {
                                    break;
                                }
                                sb.append(line);
                            }
                            networkObject.b = sb.toString();
                            networkObject.c = A.getHeaderFields();
                            A.disconnect();
                            try {
                                bufferedReader2.close();
                                A = A;
                            } catch (IOException e) {
                                Object[] objArr = {str6, e.getLocalizedMessage()};
                                StaticMethods.K("%s - Unable to close reader (%s)", objArr);
                                A = objArr;
                            }
                            if (str3 != 0) {
                                try {
                                    str3.close();
                                } catch (IOException e2) {
                                    A = new Object[]{str6, e2.getLocalizedMessage()};
                                    StaticMethods.K("%s - Unable to close stream (%s)", A);
                                }
                            }
                            try {
                                str4.close();
                            } catch (IOException e3) {
                                A = new Object[]{str6, e3.getLocalizedMessage()};
                                StaticMethods.K("%s - Unable to close stream reader (%s)", A);
                            }
                        } catch (IOException e4) {
                            bufferedReader = bufferedReader2;
                            e = e4;
                            StaticMethods.J("%s - IOException while trying to get content (%s)", str6, e);
                            A.disconnect();
                            A = A;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                    A = A;
                                } catch (IOException e5) {
                                    Object[] objArr2 = {str6, e5.getLocalizedMessage()};
                                    StaticMethods.K("%s - Unable to close reader (%s)", objArr2);
                                    A = objArr2;
                                }
                            }
                            if (str3 != 0) {
                                try {
                                    str3.close();
                                } catch (IOException e6) {
                                    A = new Object[]{str6, e6.getLocalizedMessage()};
                                    StaticMethods.K("%s - Unable to close stream (%s)", A);
                                }
                            }
                            if (str4 != 0) {
                                try {
                                    str4.close();
                                } catch (IOException e7) {
                                    A = new Object[]{str6, e7.getLocalizedMessage()};
                                    StaticMethods.K("%s - Unable to close stream reader (%s)", A);
                                }
                            }
                            return networkObject;
                        } catch (Error e8) {
                            bufferedReader = bufferedReader2;
                            e = e8;
                            StaticMethods.J("%s - Exception while trying to get content (%s)", str6, e);
                            A.disconnect();
                            A = A;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                    A = A;
                                } catch (IOException e9) {
                                    Object[] objArr3 = {str6, e9.getLocalizedMessage()};
                                    StaticMethods.K("%s - Unable to close reader (%s)", objArr3);
                                    A = objArr3;
                                }
                            }
                            if (str3 != 0) {
                                try {
                                    str3.close();
                                } catch (IOException e10) {
                                    A = new Object[]{str6, e10.getLocalizedMessage()};
                                    StaticMethods.K("%s - Unable to close stream (%s)", A);
                                }
                            }
                            if (str4 != 0) {
                                try {
                                    str4.close();
                                } catch (IOException e11) {
                                    A = new Object[]{str6, e11.getLocalizedMessage()};
                                    StaticMethods.K("%s - Unable to close stream reader (%s)", A);
                                }
                            }
                            return networkObject;
                        } catch (NullPointerException e12) {
                            bufferedReader = bufferedReader2;
                            e = e12;
                            StaticMethods.J("%s - NullPointerException while trying to get content (%s)", str6, e);
                            A.disconnect();
                            A = A;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                    A = A;
                                } catch (IOException e13) {
                                    Object[] objArr4 = {str6, e13.getLocalizedMessage()};
                                    StaticMethods.K("%s - Unable to close reader (%s)", objArr4);
                                    A = objArr4;
                                }
                            }
                            if (str3 != 0) {
                                try {
                                    str3.close();
                                } catch (IOException e14) {
                                    A = new Object[]{str6, e14.getLocalizedMessage()};
                                    StaticMethods.K("%s - Unable to close stream (%s)", A);
                                }
                            }
                            if (str4 != 0) {
                                try {
                                    str4.close();
                                } catch (IOException e15) {
                                    A = new Object[]{str6, e15.getLocalizedMessage()};
                                    StaticMethods.K("%s - Unable to close stream reader (%s)", A);
                                }
                            }
                            return networkObject;
                        } catch (ProtocolException e16) {
                            bufferedReader = bufferedReader2;
                            e = e16;
                            StaticMethods.J("%s - ProtocolException while trying to get content (%s)", str6, e);
                            A.disconnect();
                            A = A;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                    A = A;
                                } catch (IOException e17) {
                                    Object[] objArr5 = {str6, e17.getLocalizedMessage()};
                                    StaticMethods.K("%s - Unable to close reader (%s)", objArr5);
                                    A = objArr5;
                                }
                            }
                            if (str3 != 0) {
                                try {
                                    str3.close();
                                } catch (IOException e18) {
                                    A = new Object[]{str6, e18.getLocalizedMessage()};
                                    StaticMethods.K("%s - Unable to close stream (%s)", A);
                                }
                            }
                            if (str4 != 0) {
                                try {
                                    str4.close();
                                } catch (IOException e19) {
                                    A = new Object[]{str6, e19.getLocalizedMessage()};
                                    StaticMethods.K("%s - Unable to close stream reader (%s)", A);
                                }
                            }
                            return networkObject;
                        } catch (Exception e20) {
                            bufferedReader = bufferedReader2;
                            e = e20;
                            StaticMethods.J("%s - Exception while trying to get content (%s)", str6, e.getLocalizedMessage());
                            A.disconnect();
                            A = A;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                    A = A;
                                } catch (IOException e21) {
                                    Object[] objArr6 = {str6, e21.getLocalizedMessage()};
                                    StaticMethods.K("%s - Unable to close reader (%s)", objArr6);
                                    A = objArr6;
                                }
                            }
                            if (str3 != 0) {
                                try {
                                    str3.close();
                                } catch (IOException e22) {
                                    A = new Object[]{str6, e22.getLocalizedMessage()};
                                    StaticMethods.K("%s - Unable to close stream (%s)", A);
                                }
                            }
                            if (str4 != 0) {
                                try {
                                    str4.close();
                                } catch (IOException e23) {
                                    A = new Object[]{str6, e23.getLocalizedMessage()};
                                    StaticMethods.K("%s - Unable to close stream reader (%s)", A);
                                }
                            }
                            return networkObject;
                        } catch (Throwable th) {
                            bufferedReader = bufferedReader2;
                            th = th;
                            A.disconnect();
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e24) {
                                    StaticMethods.K("%s - Unable to close reader (%s)", str6, e24.getLocalizedMessage());
                                }
                            }
                            if (str3 != 0) {
                                try {
                                    str3.close();
                                } catch (IOException e25) {
                                    StaticMethods.K("%s - Unable to close stream (%s)", str6, e25.getLocalizedMessage());
                                }
                            }
                            if (str4 == 0) {
                                throw th;
                            }
                            try {
                                str4.close();
                                throw th;
                            } catch (IOException e26) {
                                StaticMethods.K("%s - Unable to close stream reader (%s)", str6, e26.getLocalizedMessage());
                                throw th;
                            }
                        }
                    } catch (ProtocolException e27) {
                        e = e27;
                    } catch (IOException e28) {
                        e = e28;
                    } catch (Error e29) {
                        e = e29;
                    } catch (NullPointerException e30) {
                        e = e30;
                    } catch (Exception e31) {
                        e = e31;
                    }
                } catch (IOException e32) {
                    e = e32;
                    str4 = 0;
                } catch (Error e33) {
                    e = e33;
                    str4 = 0;
                } catch (NullPointerException e34) {
                    e = e34;
                    str4 = 0;
                } catch (ProtocolException e35) {
                    e = e35;
                    str4 = 0;
                } catch (Exception e36) {
                    e = e36;
                    str4 = 0;
                } catch (Throwable th2) {
                    th = th2;
                    str4 = 0;
                }
            } catch (Error e37) {
                e = e37;
                str3 = 0;
                str4 = 0;
            } catch (NullPointerException e38) {
                e = e38;
                str3 = 0;
                str4 = 0;
            } catch (ProtocolException e39) {
                e = e39;
                str3 = 0;
                str4 = 0;
            } catch (IOException e40) {
                e = e40;
                str3 = 0;
                str4 = 0;
            } catch (Exception e41) {
                e = e41;
                str3 = 0;
                str4 = 0;
            } catch (Throwable th3) {
                th = th3;
                str3 = 0;
                str4 = 0;
            }
            return networkObject;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static void d(String str) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (StaticMethods.e) {
            try {
                WearableFunctionBridge.b().getDeclaredMethod("sendGenericRequest", String.class, Integer.TYPE).invoke(null, str, 5000);
                StaticMethods.I("%s - Request Sent(%s)", "Audience Manager", str);
                return;
            } catch (Exception e) {
                StaticMethods.I("Wearable - Error sending request (%s)", e.getLocalizedMessage());
                return;
            }
        }
        try {
            HttpURLConnection httpURLConnectionA = a(str);
            if (httpURLConnectionA != null) {
                httpURLConnectionA.setConnectTimeout(5000);
                httpURLConnectionA.setReadTimeout(5000);
                httpURLConnectionA.setRequestProperty("Accept-Language", StaticMethods.s());
                httpURLConnectionA.setRequestProperty("User-Agent", StaticMethods.u());
                StaticMethods.I("%s - Request Sent(%s)", "Audience Manager", str);
                Callback.f(httpURLConnectionA);
                Callback.a(httpURLConnectionA).close();
                httpURLConnectionA.disconnect();
            }
        } catch (SocketTimeoutException unused) {
            StaticMethods.K("%s - Timed out sending request(%s)", "Audience Manager", str);
        } catch (IOException e2) {
            StaticMethods.K("%s - IOException while sending request, may retry(%s)", "Audience Manager", e2.getLocalizedMessage());
        } catch (Error e3) {
            StaticMethods.K("%s - Exception while attempting to send hit, will not retry(%s)", "Audience Manager", e3.getLocalizedMessage());
        } catch (Exception e4) {
            StaticMethods.K("%s - Exception while attempting to send hit, will not retry(%s)", "Audience Manager", e4.getLocalizedMessage());
        }
    }
}
