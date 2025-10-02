package au.com.woolworths.feature.shop.homepage.presentation;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.woolworths.scanlibrary.ui.scanner.additem.AddItemActivity;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function0 e;

    public /* synthetic */ f(int i, Function0 function0) {
        this.d = i;
        this.e = function0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.d;
        Function0 function0 = this.e;
        switch (i) {
            case 0:
                Callback.g(view);
                try {
                    function0.invoke();
                    return;
                } finally {
                }
            case 1:
                Callback.g(view);
                try {
                    function0.invoke();
                    return;
                } finally {
                }
            case 2:
                Callback.g(view);
                try {
                    function0.invoke();
                    return;
                } finally {
                }
            default:
                int i2 = AddItemActivity.I;
                Callback.g(view);
                try {
                    function0.invoke();
                    return;
                } finally {
                }
        }
    }
}
