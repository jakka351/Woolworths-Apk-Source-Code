package com.swrve.sdk;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
class SwrveAssetsManagerImp implements SwrveAssetsManager {

    /* renamed from: a, reason: collision with root package name */
    public HashSet f19039a;
    public String b;
    public String c;
    public File d;

    public static String d(String str, String str2) {
        if (str2 == null || !str2.equalsIgnoreCase("image/gif")) {
            return str;
        }
        StringBuilder sbS = YU.a.s(str);
        sbS.append((String) SwrveAssetsTypes.f19041a.get(str2));
        return sbS.toString();
    }

    @Override // com.swrve.sdk.SwrveAssetsManager
    public final void a(HashSet hashSet, SwrveAssetsCompleteCallback swrveAssetsCompleteCallback) {
        boolean z = true;
        HashSet hashSet2 = null;
        if (!this.d.canWrite()) {
            SwrveLogger.d("Could not download assets because do not have write access to storageDir:%s", this.d);
        } else if (SwrveCommon.f19047a == null ? true : "38f00f8738e241daea6f37f6f55ae8414d7b0219".equals(SwrveHelper.u("Lorem ipsum dolor sit amet".getBytes(StandardCharsets.UTF_8)))) {
            HashSet hashSet3 = new HashSet();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                SwrveAssetsQueueItem swrveAssetsQueueItem = (SwrveAssetsQueueItem) it.next();
                String strD = swrveAssetsQueueItem.d();
                if (!new File(this.d, strD).exists()) {
                    for (Map.Entry entry : SwrveAssetsTypes.f19041a.entrySet()) {
                        StringBuilder sbS = YU.a.s(strD);
                        sbS.append((String) entry.getValue());
                        if (new File(this.d, sbS.toString()).exists()) {
                        }
                    }
                }
                it.remove();
                synchronized (this.f19039a) {
                    this.f19039a.add(swrveAssetsQueueItem.d());
                }
            }
            try {
                CountDownLatch countDownLatch = new CountDownLatch(hashSet.size());
                ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(10);
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    executorServiceNewFixedThreadPool.submit(new b(this, (SwrveAssetsQueueItem) it2.next(), hashSet3, countDownLatch, 0));
                }
                countDownLatch.await();
            } catch (Exception e) {
                SwrveLogger.c("Error downloading assets.", e, new Object[0]);
            }
            hashSet2 = hashSet3;
        } else {
            SwrveLogger.d("The SwrveAssetsManager failed sha1 verification so assets will not be downloaded.", new Object[0]);
            z = false;
        }
        if (swrveAssetsCompleteCallback != null) {
            swrveAssetsCompleteCallback.a(hashSet2, z);
        }
    }

    @Override // com.swrve.sdk.SwrveAssetsManager
    public final void b(String str) {
        this.b = str;
    }

    @Override // com.swrve.sdk.SwrveAssetsManager
    public final void c(String str) {
        this.c = str;
    }
}
