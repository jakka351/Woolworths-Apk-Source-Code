package androidx.activity;

import android.view.View;
import androidx.core.viewtree.ViewTree;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName
/* loaded from: classes.dex */
public final class ViewTreeOnBackPressedDispatcherOwner {
    public static final OnBackPressedDispatcherOwner a(View view) {
        Intrinsics.h(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(com.woolworths.R.id.view_tree_on_back_pressed_dispatcher_owner);
            OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = tag instanceof OnBackPressedDispatcherOwner ? (OnBackPressedDispatcherOwner) tag : null;
            if (onBackPressedDispatcherOwner != null) {
                return onBackPressedDispatcherOwner;
            }
            Object objA = ViewTree.a(view);
            view = objA instanceof View ? (View) objA : null;
        }
        return null;
    }
}
