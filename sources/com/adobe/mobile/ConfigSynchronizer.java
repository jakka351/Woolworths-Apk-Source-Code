package com.adobe.mobile;

import com.google.android.gms.wearable.DataMap;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
final class ConfigSynchronizer {

    /* renamed from: com.adobe.mobile.ConfigSynchronizer$1, reason: invalid class name */
    final class AnonymousClass1 implements Callable<String> {
        public static void a() {
            DataMap dataMap = null;
            dataMap.getString("ADOBEMOBILE_STOREDDEFAULTS_ADVERTISING_IDENTIFIER");
            throw null;
        }

        @Override // java.util.concurrent.Callable
        public final /* bridge */ /* synthetic */ String call() {
            a();
            throw null;
        }
    }
}
