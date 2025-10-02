package androidx.compose.runtime;

import kotlin.Metadata;

@InternalComposeApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/NestedMovableContent;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class NestedMovableContent {

    /* renamed from: a, reason: collision with root package name */
    public final MovableContentStateReference f1649a;
    public final MovableContentStateReference b;

    public NestedMovableContent(MovableContentStateReference movableContentStateReference, MovableContentStateReference movableContentStateReference2) {
        this.f1649a = movableContentStateReference;
        this.b = movableContentStateReference2;
    }

    /* renamed from: a, reason: from getter */
    public final MovableContentStateReference getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final MovableContentStateReference getF1649a() {
        return this.f1649a;
    }
}
