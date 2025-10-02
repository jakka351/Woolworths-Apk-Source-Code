package com.google.firebase.firestore.core;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class Transaction {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadPoolExecutor f15467a;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f15467a = threadPoolExecutor;
    }
}
