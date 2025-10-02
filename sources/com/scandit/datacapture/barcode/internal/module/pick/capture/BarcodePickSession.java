package com.scandit.datacapture.barcode.internal.module.pick.capture;

import com.scandit.datacapture.barcode.D4;
import com.scandit.datacapture.barcode.internal.module.tracking.capture.TrackedObject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class BarcodePickSession {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f17739a;
    private final Lazy b;

    public BarcodePickSession(Function0 getImpl) {
        Intrinsics.h(getImpl, "getImpl");
        this.f17739a = getImpl;
        this.b = LazyKt.b(new h(this));
    }

    public final List b() {
        return a().a();
    }

    public final boolean c() {
        HashSet hashSetE = a().e();
        if (hashSetE.isEmpty()) {
            return false;
        }
        Collection collectionValues = a().f().values();
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                if (CollectionsKt.t(hashSetE, ((TrackedObject) it.next()).b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Map d() {
        return a().b();
    }

    public final HashSet e() {
        return a().c();
    }

    public final ArrayList f() {
        return a().d();
    }

    public final HashSet g() {
        return a().e();
    }

    public final Map h() {
        return a().f();
    }

    public final HashSet i() {
        return a().g();
    }

    public final List j() {
        return a().h();
    }

    private final D4 a() {
        return (D4) this.b.getD();
    }
}
