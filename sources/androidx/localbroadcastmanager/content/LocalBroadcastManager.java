package androidx.localbroadcastmanager.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import androidx.constraintlayout.core.state.a;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

@Deprecated
/* loaded from: classes.dex */
public final class LocalBroadcastManager {
    public static final Object f = new Object();
    public static LocalBroadcastManager g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f2823a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final ArrayList d = new ArrayList();
    public final Handler e;

    public static final class BroadcastRecord {

        /* renamed from: a, reason: collision with root package name */
        public final Intent f2825a;
        public final ArrayList b;

        public BroadcastRecord(Intent intent, ArrayList arrayList) {
            this.f2825a = intent;
            this.b = arrayList;
        }
    }

    public static final class ReceiverRecord {

        /* renamed from: a, reason: collision with root package name */
        public final IntentFilter f2826a;
        public final BroadcastReceiver b;
        public boolean c;
        public boolean d;

        public ReceiverRecord(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f2826a = intentFilter;
            this.b = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder sbO = a.o(128, "Receiver{");
            sbO.append(this.b);
            sbO.append(" filter=");
            sbO.append(this.f2826a);
            if (this.d) {
                sbO.append(" DEAD");
            }
            sbO.append("}");
            return sbO.toString();
        }
    }

    public LocalBroadcastManager(Context context) {
        this.f2823a = context;
        this.e = new Handler(context.getMainLooper()) { // from class: androidx.localbroadcastmanager.content.LocalBroadcastManager.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                int size;
                BroadcastRecord[] broadcastRecordArr;
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.this;
                while (true) {
                    synchronized (localBroadcastManager.b) {
                        try {
                            size = localBroadcastManager.d.size();
                            if (size <= 0) {
                                return;
                            }
                            broadcastRecordArr = new BroadcastRecord[size];
                            localBroadcastManager.d.toArray(broadcastRecordArr);
                            localBroadcastManager.d.clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    for (int i = 0; i < size; i++) {
                        BroadcastRecord broadcastRecord = broadcastRecordArr[i];
                        int size2 = broadcastRecord.b.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            ReceiverRecord receiverRecord = (ReceiverRecord) broadcastRecord.b.get(i2);
                            if (!receiverRecord.d) {
                                receiverRecord.b.onReceive(localBroadcastManager.f2823a, broadcastRecord.f2825a);
                            }
                        }
                    }
                }
            }
        };
    }

    public static LocalBroadcastManager a(Context context) {
        LocalBroadcastManager localBroadcastManager;
        synchronized (f) {
            try {
                if (g == null) {
                    g = new LocalBroadcastManager(context.getApplicationContext());
                }
                localBroadcastManager = g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return localBroadcastManager;
    }

    public final void b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.b) {
            try {
                ReceiverRecord receiverRecord = new ReceiverRecord(intentFilter, broadcastReceiver);
                ArrayList arrayList = (ArrayList) this.b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(receiverRecord);
                for (int i = 0; i < intentFilter.countActions(); i++) {
                    String action = intentFilter.getAction(i);
                    ArrayList arrayList2 = (ArrayList) this.c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        this.c.put(action, arrayList2);
                    }
                    arrayList2.add(receiverRecord);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(Intent intent) {
        ArrayList arrayList;
        synchronized (this.b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f2823a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z = (intent.getFlags() & 8) != 0;
                if (z) {
                    Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList2 = (ArrayList) this.c.get(intent.getAction());
                if (arrayList2 != null) {
                    if (z) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList2);
                    }
                    ArrayList arrayList3 = null;
                    int i = 0;
                    while (i < arrayList2.size()) {
                        ReceiverRecord receiverRecord = (ReceiverRecord) arrayList2.get(i);
                        if (z) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + receiverRecord.f2826a);
                        }
                        if (receiverRecord.c) {
                            if (z) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            arrayList = arrayList2;
                        } else {
                            int iMatch = receiverRecord.f2826a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (iMatch >= 0) {
                                if (z) {
                                    StringBuilder sb = new StringBuilder();
                                    arrayList = arrayList2;
                                    sb.append("  Filter matched!  match=0x");
                                    sb.append(Integer.toHexString(iMatch));
                                    Log.v("LocalBroadcastManager", sb.toString());
                                } else {
                                    arrayList = arrayList2;
                                }
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(receiverRecord);
                                receiverRecord.c = true;
                            } else {
                                arrayList = arrayList2;
                                if (z) {
                                    Log.v("LocalBroadcastManager", "  Filter did not match: " + (iMatch != -4 ? iMatch != -3 ? iMatch != -2 ? iMatch != -1 ? "unknown reason" : "type" : "data" : UrlHandler.ACTION : "category"));
                                }
                            }
                        }
                        i++;
                        arrayList2 = arrayList;
                    }
                    if (arrayList3 != null) {
                        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                            ((ReceiverRecord) arrayList3.get(i2)).c = false;
                        }
                        this.d.add(new BroadcastRecord(intent, arrayList3));
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

    public final void d(BroadcastReceiver broadcastReceiver) {
        synchronized (this.b) {
            try {
                ArrayList arrayList = (ArrayList) this.b.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ReceiverRecord receiverRecord = (ReceiverRecord) arrayList.get(size);
                    receiverRecord.d = true;
                    for (int i = 0; i < receiverRecord.f2826a.countActions(); i++) {
                        String action = receiverRecord.f2826a.getAction(i);
                        ArrayList arrayList2 = (ArrayList) this.c.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                ReceiverRecord receiverRecord2 = (ReceiverRecord) arrayList2.get(size2);
                                if (receiverRecord2.b == broadcastReceiver) {
                                    receiverRecord2.d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
