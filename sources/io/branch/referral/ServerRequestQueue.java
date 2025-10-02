package io.branch.referral;

import YU.a;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import io.branch.referral.Branch;
import io.branch.referral.Defines;
import io.branch.referral.ServerRequest;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ServerRequestQueue {
    public static ServerRequestQueue f;
    public static final Object g = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences.Editor f23863a;
    public final List b;
    public final Semaphore c = new Semaphore(1);
    public int d = 0;
    public final ConcurrentHashMap e = new ConcurrentHashMap();

    public class BranchPostTask extends BranchAsyncTask<Void, Void, ServerResponse> {

        /* renamed from: a, reason: collision with root package name */
        public final ServerRequest f23864a;
        public final CountDownLatch b;

        public BranchPostTask(ServerRequest serverRequest, CountDownLatch countDownLatch) {
            this.f23864a = serverRequest;
            this.b = countDownLatch;
        }

        public final void b(ServerResponse serverResponse) throws JSONException {
            boolean z;
            BranchLogger.e("onPostExecuteInner " + this + " " + serverResponse);
            CountDownLatch countDownLatch = this.b;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            ServerRequest serverRequest = this.f23864a;
            if (serverResponse == null) {
                serverRequest.d(-116, "Null response.");
                return;
            }
            String str = serverResponse.c;
            int i = serverResponse.f23865a;
            boolean z2 = true;
            ServerRequestQueue serverRequestQueue = ServerRequestQueue.this;
            if (i == 200) {
                BranchLogger.e("onRequestSuccess " + serverResponse);
                JSONObject jSONObjectA = serverResponse.a();
                if (jSONObjectA == null) {
                    serverRequest.d(500, "Null response json.");
                }
                if ((serverRequest instanceof ServerRequestCreateUrl) && jSONObjectA != null) {
                    try {
                        Branch.i().f.put(((ServerRequestCreateUrl) serverRequest).i, jSONObjectA.getString("url"));
                    } catch (JSONException e) {
                        c.z(e, new StringBuilder("Caught JSONException "));
                    }
                }
                if (serverRequest instanceof ServerRequestInitSession) {
                    if (!Branch.i().l.f23868a && jSONObjectA != null) {
                        try {
                            if (jSONObjectA.has("session_id")) {
                                Branch.i().b.p("bnc_session_id", jSONObjectA.getString("session_id"));
                                z = true;
                            } else {
                                z = false;
                            }
                            if (jSONObjectA.has("randomized_bundle_token")) {
                                String string = jSONObjectA.getString("randomized_bundle_token");
                                if (!Branch.i().b.f().equals(string)) {
                                    Branch.i().f.clear();
                                    Branch.i().b.p("bnc_randomized_bundle_token", string);
                                    z = true;
                                }
                            }
                            if (jSONObjectA.has("randomized_device_token")) {
                                Branch.i().b.p("bnc_randomized_device_token", jSONObjectA.getString("randomized_device_token"));
                            } else {
                                z2 = z;
                            }
                            if (z2) {
                                serverRequestQueue.n();
                            }
                        } catch (JSONException e2) {
                            c.z(e2, new StringBuilder("Caught JSONException "));
                        }
                    }
                    Branch.i().h = Branch.SESSION_STATE.d;
                    Branch.i().a();
                    Branch.i().getClass();
                    Branch.i().getClass();
                }
                if (jSONObjectA != null) {
                    serverRequest.h(serverResponse, Branch.i());
                    serverRequestQueue.l(serverRequest);
                } else {
                    serverRequest.getClass();
                    serverRequestQueue.l(serverRequest);
                }
            } else {
                BranchLogger.e("onRequestFailed " + str);
                if ((serverRequest instanceof ServerRequestInitSession) && "bnc_no_value".equals(Branch.i().b.j("bnc_session_params"))) {
                    Branch.i().h = Branch.SESSION_STATE.f;
                }
                if ((i == 400 || i == 409) && (serverRequest instanceof ServerRequestCreateUrl)) {
                    Branch.BranchLinkCreateListener branchLinkCreateListener = ((ServerRequestCreateUrl) serverRequest).k;
                    if (branchLinkCreateListener != null) {
                        branchLinkCreateListener.e(null, new BranchError("Trouble creating a URL.", -105));
                    }
                } else {
                    serverRequestQueue.d = 0;
                    StringBuilder sb = new StringBuilder();
                    String string2 = "";
                    try {
                        JSONObject jSONObjectA2 = serverResponse.a();
                        if (jSONObjectA2 != null && jSONObjectA2.has("error") && jSONObjectA2.getJSONObject("error").has("message") && (string2 = jSONObjectA2.getJSONObject("error").getString("message")) != null && string2.trim().length() > 0) {
                            string2 = string2.concat(".");
                        }
                    } catch (Exception e3) {
                        BranchLogger.f("Caught Exception ServerResponse getFailReason: " + e3.getMessage());
                    }
                    serverRequest.d(i, a.p(sb, string2, " ", str));
                }
                if ((400 > i || i > 451) && i != -117) {
                    serverRequest.getClass();
                }
                Branch.i().e.l(serverRequest);
                serverRequest.g++;
            }
            serverRequestQueue.d = 0;
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.branch.referral.ServerRequestQueue.BranchPostTask.1
                @Override // java.lang.Runnable
                public final void run() {
                    ServerRequestQueue.this.k("onPostExecuteInner");
                }
            });
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:106:0x021e A[Catch: JSONException -> 0x01ef, TryCatch #16 {JSONException -> 0x01ef, blocks: (B:86:0x01d4, B:88:0x01e1, B:90:0x01e7, B:93:0x01f3, B:95:0x01fb, B:97:0x0203, B:103:0x020f, B:105:0x0217, B:106:0x021e, B:108:0x0226, B:110:0x0231, B:112:0x0237, B:113:0x023a, B:114:0x023e, B:116:0x0244, B:122:0x0250), top: B:235:0x01d2 }] */
        /* JADX WARN: Removed duplicated region for block: B:131:0x0270  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x0293  */
        /* JADX WARN: Removed duplicated region for block: B:160:0x0329  */
        /* JADX WARN: Removed duplicated region for block: B:175:0x0395  */
        /* JADX WARN: Removed duplicated region for block: B:202:0x043f  */
        /* JADX WARN: Removed duplicated region for block: B:242:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:77:0x01b3 A[Catch: JSONException -> 0x01c3, TryCatch #2 {JSONException -> 0x01c3, blocks: (B:75:0x0191, B:77:0x01b3, B:79:0x01bf), top: B:209:0x0191 }] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01d4 A[Catch: JSONException -> 0x01ef, TRY_ENTER, TryCatch #16 {JSONException -> 0x01ef, blocks: (B:86:0x01d4, B:88:0x01e1, B:90:0x01e7, B:93:0x01f3, B:95:0x01fb, B:97:0x0203, B:103:0x020f, B:105:0x0217, B:106:0x021e, B:108:0x0226, B:110:0x0231, B:112:0x0237, B:113:0x023a, B:114:0x023e, B:116:0x0244, B:122:0x0250), top: B:235:0x01d2 }] */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object doInBackground(java.lang.Object[] r18) throws org.json.JSONException {
            /*
                Method dump skipped, instructions count: 1091
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.ServerRequestQueue.BranchPostTask.doInBackground(java.lang.Object[]):java.lang.Object");
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Object obj) throws JSONException {
            ServerResponse serverResponse = (ServerResponse) obj;
            super.onPostExecute(serverResponse);
            b(serverResponse);
        }

        @Override // android.os.AsyncTask
        public final void onPreExecute() throws JSONException {
            boolean zB;
            super.onPreExecute();
            ServerRequest serverRequest = this.f23864a;
            serverRequest.f();
            PrefHelper prefHelper = serverRequest.c;
            try {
                JSONObject jSONObject = new JSONObject();
                Iterator<String> itKeys = prefHelper.c.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, prefHelper.c.get(next));
                }
                JSONObject jSONObjectOptJSONObject = serverRequest.f23862a.optJSONObject("metadata");
                if (jSONObjectOptJSONObject != null) {
                    Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                    while (itKeys2.hasNext()) {
                        String next2 = itKeys2.next();
                        jSONObject.put(next2, jSONObjectOptJSONObject.get(next2));
                    }
                }
                if (serverRequest instanceof ServerRequestRegisterInstall) {
                    JSONObject jSONObject2 = prefHelper.d;
                    if (jSONObject2.length() > 0) {
                        Iterator<String> itKeys3 = jSONObject2.keys();
                        while (itKeys3.hasNext()) {
                            String next3 = itKeys3.next();
                            serverRequest.f23862a.putOpt(next3, jSONObject2.get(next3));
                        }
                    }
                }
                serverRequest.f23862a.put("metadata", jSONObject);
            } catch (JSONException e) {
                c.z(e, new StringBuilder("Caught JSONException. Could not merge metadata, ignoring user metadata. "));
            }
            boolean zL = serverRequest.l();
            ServerRequest.BRANCH_API_VERSION branch_api_version = ServerRequest.BRANCH_API_VERSION.d;
            if (zL) {
                JSONObject jSONObjectOptJSONObject2 = serverRequest.b() == branch_api_version ? serverRequest.f23862a : serverRequest.f23862a.optJSONObject("user_data");
                if (jSONObjectOptJSONObject2 != null && (zB = prefHelper.b("bnc_limit_facebook_tracking"))) {
                    try {
                        jSONObjectOptJSONObject2.putOpt("limit_facebook_tracking", Boolean.valueOf(zB));
                    } catch (JSONException e2) {
                        c.z(e2, new StringBuilder("Caught JSONException "));
                    }
                }
            }
            if (serverRequest.k() && prefHelper.f23860a.contains("bnc_dma_eea")) {
                try {
                    if (serverRequest.b() == branch_api_version) {
                        serverRequest.f23862a.put("dma_eea", prefHelper.b("bnc_dma_eea"));
                        serverRequest.f23862a.put("dma_ad_personalization", prefHelper.b("bnc_dma_ad_personalization"));
                        serverRequest.f23862a.put("dma_ad_user_data", prefHelper.b("bnc_dma_ad_user_data"));
                    } else {
                        JSONObject jSONObjectOptJSONObject3 = serverRequest.f23862a.optJSONObject("user_data");
                        if (jSONObjectOptJSONObject3 != null) {
                            jSONObjectOptJSONObject3.put("dma_eea", prefHelper.b("bnc_dma_eea"));
                            jSONObjectOptJSONObject3.put("dma_ad_personalization", prefHelper.b("bnc_dma_ad_personalization"));
                            jSONObjectOptJSONObject3.put("dma_ad_user_data", prefHelper.b("bnc_dma_ad_user_data"));
                        }
                    }
                } catch (JSONException e3) {
                    BranchLogger.a(e3.getMessage());
                }
            }
        }
    }

    public ServerRequestQueue(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("BNC_Server_Request_Queue", 0);
        this.f23863a = sharedPreferences.edit();
        String string = sharedPreferences.getString("BNCServerRequestQueue", null);
        List listSynchronizedList = Collections.synchronizedList(new LinkedList());
        synchronized (g) {
            if (string != null) {
                try {
                    JSONArray jSONArray = new JSONArray(string);
                    int iMin = Math.min(jSONArray.length(), 25);
                    for (int i = 0; i < iMin; i++) {
                        ServerRequest serverRequestA = ServerRequest.a(jSONArray.getJSONObject(i), context);
                        if (serverRequestA != null) {
                            listSynchronizedList.add(serverRequestA);
                        }
                    }
                } catch (JSONException e) {
                    BranchLogger.f("Caught JSONException " + e.getMessage());
                }
            }
        }
        this.b = listSynchronizedList;
    }

    public static void b(CountDownLatch countDownLatch, int i, BranchPostTask branchPostTask) throws JSONException {
        ServerRequest serverRequest = branchPostTask.f23864a;
        try {
            if (countDownLatch.await(i, TimeUnit.MILLISECONDS)) {
                return;
            }
            branchPostTask.cancel(true);
            Defines.RequestPath requestPath = serverRequest.b;
            branchPostTask.b(new ServerResponse(-120, ""));
        } catch (InterruptedException e) {
            BranchLogger.b("Caught InterruptedException " + e.getMessage());
            branchPostTask.cancel(true);
            Defines.RequestPath requestPath2 = serverRequest.b;
            branchPostTask.b(new ServerResponse(-120, e.getMessage()));
        }
    }

    public final void a(String str, String str2) {
        this.e.put(str, str2);
    }

    public final void c() {
        synchronized (g) {
            try {
                this.b.clear();
                j();
            } catch (UnsupportedOperationException e) {
                BranchLogger.b("Caught UnsupportedOperationException " + e.getMessage());
            }
        }
    }

    public final void d(ServerRequest serverRequest, final int i) throws JSONException {
        BranchLogger.e("executeTimedBranchPostTask " + serverRequest);
        if (serverRequest instanceof ServerRequestInitSession) {
            BranchLogger.e("callback to be returned " + ((ServerRequestInitSession) serverRequest).i);
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final BranchPostTask branchPostTask = new BranchPostTask(serverRequest, countDownLatch);
        branchPostTask.a(new Void[0]);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            new Thread(new Runnable(this) { // from class: io.branch.referral.ServerRequestQueue.1
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    ServerRequestQueue.b(countDownLatch, i, branchPostTask);
                }
            }).start();
        } else {
            b(countDownLatch, i, branchPostTask);
        }
    }

    public final int e() {
        int size;
        synchronized (g) {
            size = this.b.size();
        }
        return size;
    }

    public final void f(ServerRequest serverRequest) {
        boolean z;
        BranchLogger.a("handleNewRequest " + serverRequest);
        if (Branch.i().l.f23868a && !serverRequest.i()) {
            BranchLogger.a("Requested operation cannot be completed since tracking is disabled [" + serverRequest.b.d + "]");
            serverRequest.d(-117, "");
            return;
        }
        if (Branch.i().h != Branch.SESSION_STATE.d && !((z = serverRequest instanceof ServerRequestInitSession)) && !z && !(serverRequest instanceof ServerRequestCreateUrl)) {
            BranchLogger.a("handleNewRequest " + serverRequest + " needs a session");
            serverRequest.e.add(ServerRequest.PROCESS_WAIT_LOCK.d);
        }
        synchronized (g) {
            try {
                this.b.add(serverRequest);
                if (e() >= 25) {
                    this.b.remove(1);
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
        serverRequest.g();
        k("handleNewRequest");
    }

    public final void g(ServerRequest serverRequest, int i) {
        synchronized (g) {
            try {
                try {
                    if (this.b.size() < i) {
                        i = this.b.size();
                    }
                    this.b.add(i, serverRequest);
                    j();
                } catch (IndexOutOfBoundsException e) {
                    BranchLogger.b("Caught IndexOutOfBoundsException " + e.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ServerRequest h() {
        ServerRequest serverRequest;
        synchronized (g) {
            try {
                serverRequest = (ServerRequest) this.b.get(0);
            } catch (IndexOutOfBoundsException | NoSuchElementException e) {
                BranchLogger.f("Caught Exception ServerRequestQueue peek: " + e.getMessage());
                serverRequest = null;
            }
        }
        return serverRequest;
    }

    public final ServerRequest i(int i) {
        ServerRequest serverRequest;
        synchronized (g) {
            try {
                serverRequest = (ServerRequest) this.b.get(i);
            } catch (IndexOutOfBoundsException | NoSuchElementException e) {
                BranchLogger.b("Caught Exception ServerRequestQueue peekAt " + i + ": " + e.getMessage());
                serverRequest = null;
            }
        }
        return serverRequest;
    }

    public final void j() {
        JSONObject jSONObjectM;
        try {
            JSONArray jSONArray = new JSONArray();
            synchronized (g) {
                try {
                    for (ServerRequest serverRequest : this.b) {
                        serverRequest.getClass();
                        if (!(serverRequest instanceof ServerRequestCreateUrl) && (jSONObjectM = serverRequest.m()) != null) {
                            jSONArray.put(jSONObjectM);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f23863a.putString("BNCServerRequestQueue", jSONArray.toString()).apply();
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            BranchLogger.b("Failed to persist queue".concat(message));
        }
    }

    public final void k(String str) {
        Semaphore semaphore = this.c;
        BranchLogger.e("processNextQueueItem ".concat(str));
        try {
            semaphore.acquire();
            if (this.d != 0 || e() <= 0) {
                semaphore.release();
                return;
            }
            this.d = 1;
            ServerRequest serverRequestH = h();
            semaphore.release();
            if (serverRequestH == null) {
                l(null);
                return;
            }
            BranchLogger.a("processNextQueueItem, req " + serverRequestH);
            if (serverRequestH.e.size() > 0) {
                this.d = 0;
                return;
            }
            if (!(serverRequestH instanceof ServerRequestRegisterInstall) && Branch.i().b.f().equals("bnc_no_value")) {
                BranchLogger.a("Branch Error: User session has not been initialized!");
                this.d = 0;
                serverRequestH.d(-101, "");
                return;
            }
            if ((((serverRequestH instanceof ServerRequestInitSession) || (serverRequestH instanceof ServerRequestCreateUrl)) ? false : true) && (Branch.i().b.j("bnc_session_id").equals("bnc_no_value") || Branch.i().b.g().equals("bnc_no_value"))) {
                this.d = 0;
                serverRequestH.d(-101, "");
                return;
            }
            SharedPreferences sharedPreferences = Branch.i().b.f23860a;
            d(serverRequestH, sharedPreferences.getInt("bnc_connect_timeout", ModuleDescriptor.MODULE_VERSION) + sharedPreferences.getInt("bnc_timeout", 5500));
        } catch (Exception e) {
            StringBuilder sbU = a.u("Caught Exception ", str, " processNextQueueItem: ");
            sbU.append(e.getMessage());
            sbU.append(" stacktrace: ");
            sbU.append(BranchLogger.d(e));
            BranchLogger.b(sbU.toString());
        }
    }

    public final void l(ServerRequest serverRequest) {
        synchronized (g) {
            try {
                this.b.remove(serverRequest);
                j();
            } catch (UnsupportedOperationException e) {
                BranchLogger.b("Caught UnsupportedOperationException " + e.getMessage());
            }
        }
    }

    public final void m(ServerRequest.PROCESS_WAIT_LOCK process_wait_lock) {
        synchronized (g) {
            try {
                for (ServerRequest serverRequest : this.b) {
                    if (serverRequest != null) {
                        serverRequest.e.remove(process_wait_lock);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n() throws JSONException {
        JSONObject jSONObject;
        for (int i = 0; i < e(); i++) {
            try {
                ServerRequest serverRequestI = i(i);
                if (serverRequestI != null && (jSONObject = serverRequestI.f23862a) != null) {
                    if (jSONObject.has("session_id")) {
                        serverRequestI.f23862a.put("session_id", Branch.i().b.j("bnc_session_id"));
                    }
                    if (jSONObject.has("randomized_bundle_token")) {
                        serverRequestI.f23862a.put("randomized_bundle_token", Branch.i().b.f());
                    }
                    if (jSONObject.has("randomized_device_token")) {
                        serverRequestI.f23862a.put("randomized_device_token", Branch.i().b.g());
                    }
                }
            } catch (JSONException e) {
                BranchLogger.b("Caught JSONException " + e.getMessage());
                return;
            }
        }
    }
}
