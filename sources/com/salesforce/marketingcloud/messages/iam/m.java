package com.salesforce.marketingcloud.messages.iam;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.alarms.a;
import com.salesforce.marketingcloud.alarms.b;
import com.salesforce.marketingcloud.media.b;
import com.salesforce.marketingcloud.media.o;
import com.salesforce.marketingcloud.messages.iam.InAppMessage;
import com.salesforce.marketingcloud.messages.iam.InAppMessageManager;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.bouncycastle.i18n.TextBundle;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class m implements InAppMessageManager, i, b.InterfaceC0348b, b.a, com.salesforce.marketingcloud.events.f {
    private static final String A = "minDurationBetweenMessages";
    private static final int v = 1;

    @VisibleForTesting
    private static final int w = 111;
    static final String x = com.salesforce.marketingcloud.g.a("InAppMessageManager");
    private static final String y = "messagesAttemptedInSession";
    private static final String z = "maxMessagesPerSession";
    private final com.salesforce.marketingcloud.alarms.b d;
    private final UrlHandler e;
    private final com.salesforce.marketingcloud.internal.l f;
    final Context g;
    final com.salesforce.marketingcloud.storage.j h;
    final com.salesforce.marketingcloud.analytics.f i;
    final Object j = new Object();
    private final com.salesforce.marketingcloud.config.a k;
    private Typeface l;
    private int m;
    private com.salesforce.marketingcloud.media.b n;
    private InAppMessage o;
    private final AtomicInteger p;

    @VisibleForTesting
    final AtomicInteger q;

    @VisibleForTesting
    final Handler r;
    private final Handler s;

    @GuardedBy
    InAppMessageManager.EventListener t;
    o u;

    public class a extends com.salesforce.marketingcloud.internal.g {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Object[] objArr, String str2) {
            super(str, objArr);
            this.b = str2;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            InAppMessage inAppMessageA = m.this.h.p().a(Collections.singletonList(this.b), m.this.h.b());
            if (inAppMessageA != null) {
                m.this.d(inAppMessageA);
            } else {
                com.salesforce.marketingcloud.g.a(m.x, "Unable to find InAppMessage for message id [%s]", this.b);
            }
        }
    }

    public class b extends com.salesforce.marketingcloud.internal.g {
        final /* synthetic */ InAppMessage b;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b bVar = b.this;
                m.this.t.didShowMessage(bVar.b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Object[] objArr, InAppMessage inAppMessage) {
            super(str, objArr);
            this.b = inAppMessage;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            m.this.h.p().a(this.b);
            m.this.i.a(this.b);
            m.this.d();
            synchronized (m.this.j) {
                if (m.this.t != null) {
                    try {
                        new Handler(Looper.getMainLooper()).post(new a());
                    } catch (Exception e) {
                        com.salesforce.marketingcloud.g.b(m.x, e, "InAppMessage EventListener threw an exception", new Object[0]);
                    }
                }
            }
        }
    }

    public class c extends com.salesforce.marketingcloud.internal.g {
        public c(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            m mVar = m.this;
            mVar.a(mVar.h.p().e(m.this.h.b()));
        }
    }

    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InAppMessage f17011a;

        public d(InAppMessage inAppMessage) {
            this.f17011a = inAppMessage;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (m.this.j) {
                try {
                    InAppMessageManager.EventListener eventListener = m.this.t;
                    if (eventListener != null) {
                        try {
                            if (!eventListener.shouldShowMessage(this.f17011a)) {
                                com.salesforce.marketingcloud.g.a(m.x, "InAppMessage EventListener[%s] returned false for shouldShowMessage [%s]", m.this.t.getClass().getName(), this.f17011a.id());
                                return;
                            }
                        } catch (Exception e) {
                            com.salesforce.marketingcloud.g.b(m.x, e, "InAppMessage EventListener threw exception during shouldShowMessage", new Object[0]);
                        }
                    }
                    try {
                        Class<? extends f> clsA = m.this.a(this.f17011a);
                        if (clsA != null) {
                            m mVar = m.this;
                            if (mVar.a(clsA, this.f17011a, mVar.g)) {
                                m.this.g.startActivity(new Intent(m.this.g, clsA).setFlags(276889600).putExtra("messageHandler", new k(this.f17011a)));
                            }
                        } else {
                            com.salesforce.marketingcloud.g.a(m.x, "Not supported", new Object[0]);
                        }
                    } catch (Exception e2) {
                        com.salesforce.marketingcloud.g.b(m.x, e2, "Failed to display InAppMessage [%s]", this.f17011a.id());
                    }
                } finally {
                }
            }
        }
    }

    public static /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17012a;

        static {
            int[] iArr = new int[InAppMessage.Type.values().length];
            f17012a = iArr;
            try {
                iArr[InAppMessage.Type.bannerTop.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17012a[InAppMessage.Type.bannerBottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17012a[InAppMessage.Type.modal.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17012a[InAppMessage.Type.fullImageFill.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17012a[InAppMessage.Type.full.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public m(Context context, com.salesforce.marketingcloud.storage.j jVar, com.salesforce.marketingcloud.alarms.b bVar, o oVar, UrlHandler urlHandler, com.salesforce.marketingcloud.internal.l lVar, com.salesforce.marketingcloud.analytics.f fVar, @NonNull Handler handler, @NonNull com.salesforce.marketingcloud.config.a aVar) {
        this.g = context;
        this.h = jVar;
        this.d = bVar;
        this.u = oVar;
        this.e = urlHandler;
        this.i = fVar;
        this.f = lVar;
        this.k = aVar;
        bVar.a(this, a.EnumC0346a.h);
        this.q = new AtomicInteger();
        this.p = new AtomicInteger();
        this.r = new Handler(Looper.getMainLooper());
        this.s = handler;
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(com.salesforce.marketingcloud.storage.db.i.e, this.h.p().d(this.h.b()));
            InAppMessageManager.EventListener eventListener = this.t;
            if (eventListener != null) {
                jSONObject.put("eventListener", eventListener.getClass().getName());
            }
            jSONObject.put("subscriberToken", this.h.c().b(com.salesforce.marketingcloud.storage.c.j, "null"));
            jSONObject.put("custom_font_set", this.l != null);
            jSONObject.put("status_bar_color", this.m);
            return jSONObject;
        } catch (Exception e2) {
            com.salesforce.marketingcloud.g.b(x, e2, "Unable to compile componentState for InAppMessageManager", new Object[0]);
            return jSONObject;
        }
    }

    public void b(InAppMessage inAppMessage) {
        try {
            this.i.b(inAppMessage);
        } catch (Exception e2) {
            com.salesforce.marketingcloud.g.b(x, e2, "Failed to log download analytics for IAM %s", inAppMessage.id());
        }
    }

    public void c() {
        this.s.removeCallbacksAndMessages(null);
    }

    @Override // com.salesforce.marketingcloud.messages.iam.i
    public boolean canDisplay(@NonNull InAppMessage inAppMessage) {
        InAppMessage inAppMessage2 = this.o;
        if (inAppMessage2 == null) {
            this.f.b().execute(new b("can_display", new Object[0], inAppMessage));
            this.o = inAppMessage;
            return true;
        }
        if (inAppMessage == inAppMessage2) {
            return true;
        }
        com.salesforce.marketingcloud.g.a(x, "In App Message [%s] not displayed because [%s] is currently being displayed", inAppMessage.id(), this.o.id());
        return false;
    }

    @RestrictTo
    public void d(@Nullable InAppMessage inAppMessage) {
        if (inAppMessage == null || c(inAppMessage)) {
            return;
        }
        this.s.postDelayed(new d(inAppMessage), TimeUnit.SECONDS.toMillis(inAppMessage.messageDelaySec()));
    }

    @Override // com.salesforce.marketingcloud.messages.iam.i
    public int getStatusBarColor() {
        return this.m;
    }

    @Override // com.salesforce.marketingcloud.messages.iam.i
    @Nullable
    public Typeface getTypeface() {
        return this.l;
    }

    @Override // com.salesforce.marketingcloud.messages.iam.i
    public void handleMessageFinished(@NonNull InAppMessage inAppMessage, @NonNull j jVar) {
        InAppMessage inAppMessage2 = this.o;
        if (inAppMessage2 != null && inAppMessage2.id().equals(inAppMessage.id())) {
            com.salesforce.marketingcloud.analytics.f fVar = this.i;
            if (fVar != null) {
                fVar.a(inAppMessage, jVar);
            }
            synchronized (this.j) {
                InAppMessageManager.EventListener eventListener = this.t;
                if (eventListener != null) {
                    try {
                        eventListener.didCloseMessage(inAppMessage);
                    } catch (Exception e2) {
                        com.salesforce.marketingcloud.g.b(x, e2, "InAppMessageEventListener threw an exception", new Object[0]);
                    }
                }
            }
        }
        this.o = null;
    }

    @Override // com.salesforce.marketingcloud.events.f
    public void handleOutcomes(@NonNull Collection<String> collection) {
        if (collection == null || collection.isEmpty()) {
            return;
        }
        String str = x;
        com.salesforce.marketingcloud.g.d(str, "Resolving IAM from outcomes %s", collection.toString());
        InAppMessage inAppMessageA = this.h.p().a(collection, this.h.b());
        if (inAppMessageA == null) {
            com.salesforce.marketingcloud.g.d(str, "No message resolved.", new Object[0]);
        } else {
            com.salesforce.marketingcloud.g.d(str, "Outcomes resolved to message[%s]", inAppMessageA.id());
            d(inAppMessageA);
        }
    }

    @Override // com.salesforce.marketingcloud.messages.iam.i
    public o imageHandler() {
        return this.u;
    }

    @Override // com.salesforce.marketingcloud.messages.iam.InAppMessageManager
    public void setInAppMessageListener(@Nullable InAppMessageManager.EventListener eventListener) {
        synchronized (this.j) {
            this.t = eventListener;
        }
    }

    @Override // com.salesforce.marketingcloud.messages.iam.InAppMessageManager
    public void setStatusBarColor(int i) {
        this.m = i;
    }

    @Override // com.salesforce.marketingcloud.messages.iam.InAppMessageManager
    public void setTypeface(@Nullable Typeface typeface) {
        this.l = typeface;
    }

    @Override // com.salesforce.marketingcloud.messages.iam.InAppMessageManager
    public void showMessage(@NonNull String str) {
        if (str == null) {
            return;
        }
        this.f.b().execute(new a("iam_showMessage", new Object[0], str));
    }

    @Override // com.salesforce.marketingcloud.messages.iam.i
    public UrlHandler urlHandler() {
        return this.e;
    }

    public Class<? extends f> a(InAppMessage inAppMessage) {
        int i = e.f17012a[inAppMessage.type().ordinal()];
        if (i == 1 || i == 2) {
            return IamBannerActivity.class;
        }
        if (i == 3) {
            return IamModalActivity.class;
        }
        if (i == 4) {
            return IamFullImageFillActivity.class;
        }
        if (i != 5) {
            return null;
        }
        return IamFullscreenActivity.class;
    }

    public void b() {
        this.q.set(0);
        this.p.set(0);
        this.r.removeCallbacksAndMessages(null);
    }

    @VisibleForTesting
    public boolean c(@NonNull InAppMessage inAppMessage) throws JSONException {
        boolean z2 = false;
        if (inAppMessage.displayLimitOverride()) {
            com.salesforce.marketingcloud.g.a(x, "InAppMessage [%s] has displayLimit Override set. The message will not honour displayLimit settings", inAppMessage.id());
            return false;
        }
        int i = this.h.f().getInt(com.salesforce.marketingcloud.events.c.s, Integer.MAX_VALUE);
        try {
            JSONObject jSONObject = new JSONObject();
            int i2 = this.q.get();
            String str = z;
            try {
                if (i2 < i) {
                    if (this.r.hasMessages(111)) {
                        jSONObject.put(A, this.h.f().getInt(com.salesforce.marketingcloud.events.c.t, 0));
                    }
                    if (z2 || !this.k.h()) {
                        return z2;
                    }
                    this.i.a(inAppMessage, jSONObject);
                    return z2;
                }
                jSONObject.put(z, this.h.f().getInt(com.salesforce.marketingcloud.events.c.s, 0));
                str = y;
                jSONObject.put(str, this.p.incrementAndGet());
                z2 = true;
                if (z2) {
                }
                return z2;
            } catch (Exception e2) {
                e = e2;
                z2 = true;
                com.salesforce.marketingcloud.g.b(x, e, "Failed to log message Debug Analytics for IAM %s", inAppMessage.id());
                return z2;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    @VisibleForTesting
    public void d() {
        this.q.incrementAndGet();
        int i = this.h.f().getInt(com.salesforce.marketingcloud.events.c.t, 0);
        if (i > 0) {
            this.r.sendMessageDelayed(this.r.obtainMessage(111), TimeUnit.SECONDS.toMillis(i));
        }
    }

    private boolean a(String str) {
        try {
            com.salesforce.marketingcloud.util.l.f(str);
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    public void b(boolean z2) {
        this.d.e(a.EnumC0346a.h);
        this.r.removeCallbacksAndMessages(null);
        com.salesforce.marketingcloud.media.b bVar = this.n;
        if (bVar != null) {
            bVar.b();
        }
        if (z2) {
            com.salesforce.marketingcloud.storage.g gVarP = this.h.p();
            this.u.a((Collection<String>) gVarP.e(this.h.b()));
            gVarP.a(Collections.EMPTY_LIST);
        }
    }

    @Override // com.salesforce.marketingcloud.alarms.b.InterfaceC0348b
    public void a(@NonNull a.EnumC0346a enumC0346a) {
        if (enumC0346a == a.EnumC0346a.h) {
            this.f.b().execute(new c("iam_image_cache", new Object[0]));
        }
    }

    @Nullable
    public String b(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("id");
        String strOptString2 = jSONObject.optString("activityInstanceId");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return "";
        }
        String strOptString3 = jSONObject.optString("endDateUtc", null);
        if (strOptString3 != null) {
            try {
                if (com.salesforce.marketingcloud.util.l.f(strOptString3).getTime() < System.currentTimeMillis()) {
                    return "ExpiredMessage";
                }
            } catch (Exception unused) {
                return "InvalidDate";
            }
        }
        String strOptString4 = jSONObject.optString("startDateUtc", null);
        if (strOptString4 != null && a(strOptString4)) {
            return "InvalidDate";
        }
        String strOptString5 = jSONObject.optString("modifiedDateUtc", null);
        if (strOptString5 == null) {
            return "NoModifiedDate";
        }
        if (a(strOptString5)) {
            return "InvalidDate";
        }
        try {
            InAppMessage.Type.valueOf(jSONObject.getString("type"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("media");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("title");
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("body");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("buttons");
            if (jSONObjectOptJSONObject == null && jSONObjectOptJSONObject2 == null && jSONObjectOptJSONObject3 == null && (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0)) {
                return "NoContent";
            }
            if (jSONObjectOptJSONObject != null) {
                Object objOpt = jSONObjectOptJSONObject.opt("url");
                if (!(objOpt instanceof String) || TextUtils.isEmpty((String) objOpt)) {
                    return "InvalidMedia";
                }
            }
            if (jSONObjectOptJSONObject2 != null && TextUtils.isEmpty(jSONObjectOptJSONObject2.optString(TextBundle.TEXT_ENTRY, null))) {
                return "InvalidTitle";
            }
            if (jSONObjectOptJSONObject3 != null && TextUtils.isEmpty(jSONObjectOptJSONObject3.optString(TextBundle.TEXT_ENTRY, null))) {
                return "InvalidBody";
            }
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject4 == null || TextUtils.isEmpty(jSONObjectOptJSONObject4.optString("id")) || TextUtils.isEmpty(jSONObjectOptJSONObject4.optString(TextBundle.TEXT_ENTRY))) {
                        return "InvalidButton";
                    }
                }
            }
            return null;
        } catch (Exception unused2) {
            return "NoMessageType";
        }
    }

    @Override // com.salesforce.marketingcloud.media.b.a
    public void a(boolean z2) {
        if (z2) {
            this.d.d(a.EnumC0346a.h);
        } else {
            this.d.b(a.EnumC0346a.h);
        }
    }

    @RestrictTo
    @WorkerThread
    public void a(JSONObject jSONObject) {
        if (jSONObject.optInt("version") != 1) {
            com.salesforce.marketingcloud.g.b(x, "Unable to handle sync payload due to version mismatch", new Object[0]);
            return;
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("items");
            int length = jSONArray.length();
            com.salesforce.marketingcloud.g.a(x, "%d in app message(s) received from sync.", Integer.valueOf(length));
            TreeSet treeSet = new TreeSet();
            com.salesforce.marketingcloud.storage.g gVarP = this.h.p();
            com.salesforce.marketingcloud.util.c cVarB = this.h.b();
            List<String> listE = gVarP.e(cVarB);
            for (int i = 0; i < length; i++) {
                try {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    String strB = b(jSONObject2);
                    if (strB == null) {
                        InAppMessage inAppMessage = new InAppMessage(jSONObject2);
                        if (gVarP.a(inAppMessage, cVarB) == 1) {
                            b(inAppMessage);
                        }
                        gVarP.b(inAppMessage.id(), jSONObject2.optInt("displayCount", 0));
                        treeSet.add(inAppMessage.id());
                    } else if (!strB.isEmpty()) {
                        this.i.a(jSONObject2.optString("id"), jSONObject2.optString("activityInstanceId"), Collections.singletonList(strB));
                    }
                } catch (Exception e2) {
                    com.salesforce.marketingcloud.g.b(x, e2, "Unable to parse in app message payload", new Object[0]);
                }
            }
            gVarP.a(treeSet);
            List<String> listE2 = gVarP.e(cVarB);
            a(listE2);
            TreeSet treeSet2 = new TreeSet(listE);
            treeSet2.removeAll(listE2);
            this.u.a((Collection<String>) treeSet2);
        } catch (JSONException e3) {
            com.salesforce.marketingcloud.g.b(x, e3, "Unable to get InAppMessages from sync payload", new Object[0]);
        }
    }

    public boolean a(Class<? extends f> cls, InAppMessage inAppMessage, Context context) throws ClassNotFoundException {
        return (cls == Class.forName(IamFullscreenActivity.class.getName()) && inAppMessage.type() == InAppMessage.Type.fullImageFill && context.getResources().getConfiguration().orientation != 1) ? false : true;
    }

    public void a(@NonNull List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        com.salesforce.marketingcloud.media.b bVar = this.n;
        if (bVar != null) {
            bVar.b();
        }
        com.salesforce.marketingcloud.media.b bVarA = this.u.a(list);
        this.n = bVarA;
        bVarA.a(this);
    }
}
