package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/platform/TypefaceDirtyTrackerLinkedList;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TypefaceDirtyTrackerLinkedList {

    /* renamed from: a, reason: collision with root package name */
    public final State f2146a;
    public final TypefaceDirtyTrackerLinkedList b;
    public final Object c;

    public TypefaceDirtyTrackerLinkedList(State state, TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList) {
        this.f2146a = state;
        this.b = typefaceDirtyTrackerLinkedList;
        this.c = state.getValue();
    }

    public final Typeface a() {
        Object obj = this.c;
        Intrinsics.f(obj, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) obj;
    }

    public final boolean b() {
        if (this.f2146a.getValue() != this.c) {
            return true;
        }
        TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList = this.b;
        return typefaceDirtyTrackerLinkedList != null && typefaceDirtyTrackerLinkedList.b();
    }
}
