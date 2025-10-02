package com.auth0.android.request.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/auth0/android/request/internal/CommonThreadSwitcher;", "Lcom/auth0/android/request/internal/ThreadSwitcher;", "Companion", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CommonThreadSwitcher implements ThreadSwitcher {
    public static final Companion b = new Companion();
    public static volatile CommonThreadSwitcher c;

    /* renamed from: a, reason: collision with root package name */
    public final DefaultThreadSwitcher f13682a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/auth0/android/request/internal/CommonThreadSwitcher$Companion;", "", "Lcom/auth0/android/request/internal/CommonThreadSwitcher;", "INSTANCE", "Lcom/auth0/android/request/internal/CommonThreadSwitcher;", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public final CommonThreadSwitcher a() {
            if (CommonThreadSwitcher.c != null) {
                CommonThreadSwitcher commonThreadSwitcher = CommonThreadSwitcher.c;
                Intrinsics.e(commonThreadSwitcher);
                return commonThreadSwitcher;
            }
            synchronized (this) {
                if (CommonThreadSwitcher.c == null) {
                    CommonThreadSwitcher.c = new CommonThreadSwitcher(new DefaultThreadSwitcher());
                }
            }
            CommonThreadSwitcher commonThreadSwitcher2 = CommonThreadSwitcher.c;
            Intrinsics.e(commonThreadSwitcher2);
            return commonThreadSwitcher2;
        }
    }

    public CommonThreadSwitcher(DefaultThreadSwitcher defaultThreadSwitcher) {
        this.f13682a = defaultThreadSwitcher;
    }
}
