package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes.dex */
class q4 {
    private static final String f = "LocalBroadcastManager";
    private static final boolean g = false;
    static final int h = 1;
    private static final Object i = new Object();
    private static q4 j;

    /* renamed from: a, reason: collision with root package name */
    private final Context f16642a;
    private final HashMap<BroadcastReceiver, ArrayList<IntentFilter>> b = new HashMap<>();
    private final HashMap<String, ArrayList<c>> c = new HashMap<>();
    private final ArrayList<b> d = new ArrayList<>();
    private final Handler e;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                q4.this.a();
            } else {
                super.handleMessage(message);
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        final Intent f16644a;
        final ArrayList<c> b;

        public b(Intent intent, ArrayList<c> arrayList) {
            this.f16644a = intent;
            this.b = arrayList;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        final IntentFilter f16645a;
        final BroadcastReceiver b;
        boolean c;

        public c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f16645a = intentFilter;
            this.b = broadcastReceiver;
        }

        public String toString() {
            return "Receiver{" + this.b + " filter=" + this.f16645a + "}";
        }
    }

    private q4(Context context) {
        this.f16642a = context;
        this.e = new a(context.getMainLooper());
    }

    public static q4 a(Context context) {
        q4 q4Var;
        synchronized (i) {
            try {
                if (j == null) {
                    j = new q4(context.getApplicationContext());
                }
                q4Var = j;
            } catch (Throwable th) {
                throw th;
            }
        }
        return q4Var;
    }

    public void b(Intent intent) {
        if (a(intent)) {
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.b) {
                try {
                    size = this.d.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    this.d.toArray(bVarArr);
                    this.d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = bVarArr[i2];
                for (int i3 = 0; i3 < bVar.b.size(); i3++) {
                    bVar.b.get(i3).b.onReceive(this.f16642a, bVar.f16644a);
                }
            }
        }
    }

    public void a(BroadcastReceiver broadcastReceiver) {
        synchronized (this.b) {
            try {
                ArrayList<IntentFilter> arrayListRemove = this.b.remove(broadcastReceiver);
                if (arrayListRemove != null) {
                    for (int i2 = 0; i2 < arrayListRemove.size(); i2++) {
                        IntentFilter intentFilter = arrayListRemove.get(i2);
                        for (int i3 = 0; i3 < intentFilter.countActions(); i3++) {
                            String action = intentFilter.getAction(i3);
                            ArrayList<c> arrayList = this.c.get(action);
                            if (arrayList != null) {
                                int i4 = 0;
                                while (i4 < arrayList.size()) {
                                    if (arrayList.get(i4).b == broadcastReceiver) {
                                        arrayList.remove(i4);
                                        i4--;
                                    }
                                    i4++;
                                }
                                if (arrayList.size() <= 0) {
                                    this.c.remove(action);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.b) {
            try {
                c cVar = new c(intentFilter, broadcastReceiver);
                ArrayList<IntentFilter> arrayList = this.b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(intentFilter);
                for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                    String action = intentFilter.getAction(i2);
                    ArrayList<c> arrayList2 = this.c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.c.put(action, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean a(Intent intent) {
        ArrayList<c> arrayList;
        int i2;
        String str;
        String str2;
        synchronized (this.b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f16642a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z = (intent.getFlags() & 8) != 0;
                if (z) {
                    Log.v(f, "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList<c> arrayList2 = this.c.get(intent.getAction());
                if (arrayList2 != null) {
                    if (z) {
                        Log.v(f, "Action list: " + arrayList2);
                    }
                    ArrayList arrayList3 = null;
                    int i3 = 0;
                    while (i3 < arrayList2.size()) {
                        c cVar = arrayList2.get(i3);
                        if (z) {
                            StringBuilder sb = new StringBuilder();
                            arrayList = arrayList2;
                            sb.append("Matching against filter ");
                            sb.append(cVar.f16645a);
                            Log.v(f, sb.toString());
                        } else {
                            arrayList = arrayList2;
                        }
                        if (!cVar.c) {
                            i2 = i3;
                            int iMatch = cVar.f16645a.match(action, strResolveTypeIfNeeded, scheme, data, categories, f);
                            if (iMatch >= 0) {
                                if (z) {
                                    StringBuilder sb2 = new StringBuilder();
                                    str = action;
                                    sb2.append("Filter matched! match=0x");
                                    sb2.append(Integer.toHexString(iMatch));
                                    Log.v(f, sb2.toString());
                                } else {
                                    str = action;
                                }
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(cVar);
                                cVar.c = true;
                            } else {
                                str = action;
                                if (z) {
                                    str2 = "Filter did not match: " + (iMatch != -4 ? iMatch != -3 ? iMatch != -2 ? iMatch != -1 ? "unknown reason" : "type" : "data" : UrlHandler.ACTION : "category");
                                    Log.v(f, str2);
                                }
                            }
                        } else if (z) {
                            str2 = "Filter's target already added";
                            i2 = i3;
                            str = action;
                            Log.v(f, str2);
                        } else {
                            i2 = i3;
                            str = action;
                        }
                        i3 = i2 + 1;
                        arrayList2 = arrayList;
                        action = str;
                    }
                    if (arrayList3 != null) {
                        for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                            ((c) arrayList3.get(i4)).c = false;
                        }
                        this.d.add(new b(intent, arrayList3));
                        if (!this.e.hasMessages(1)) {
                            this.e.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
