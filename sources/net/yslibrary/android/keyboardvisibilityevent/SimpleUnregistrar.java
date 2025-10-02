package net.yslibrary.android.keyboardvisibilityevent;

import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnet/yslibrary/android/keyboardvisibilityevent/SimpleUnregistrar;", "Lnet/yslibrary/android/keyboardvisibilityevent/Unregistrar;", "keyboardvisibilityevent_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes8.dex */
public final class SimpleUnregistrar implements Unregistrar {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f26630a;
    public final WeakReference b;

    public SimpleUnregistrar(ShoppingListDetailsActivity shoppingListDetailsActivity, KeyboardVisibilityEvent$registerEventListener$layoutListener$1 keyboardVisibilityEvent$registerEventListener$layoutListener$1) {
        this.f26630a = new WeakReference(shoppingListDetailsActivity);
        this.b = new WeakReference(keyboardVisibilityEvent$registerEventListener$layoutListener$1);
    }
}
