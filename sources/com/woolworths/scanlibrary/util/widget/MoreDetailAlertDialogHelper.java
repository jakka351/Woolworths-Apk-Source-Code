package com.woolworths.scanlibrary.util.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/scanlibrary/util/widget/MoreDetailAlertDialogHelper;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class MoreDetailAlertDialogHelper {

    /* renamed from: a, reason: collision with root package name */
    public final Context f21381a;
    public AlertDialog b;
    public final Lazy c;
    public final AlertDialog.Builder d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;
    public final Lazy i;
    public final Lazy j;
    public boolean k;

    public MoreDetailAlertDialogHelper(@NotNull Context context) {
        Intrinsics.h(context, "context");
        this.f21381a = context;
        final int i = 0;
        this.c = LazyKt.b(new Function0(this) { // from class: com.woolworths.scanlibrary.util.widget.e
            public final /* synthetic */ MoreDetailAlertDialogHelper e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return LayoutInflater.from(this.e.f21381a).inflate(R.layout.dialog_error_alert, (ViewGroup) null);
                    case 1:
                        View viewFindViewById = this.e.a().findViewById(R.id.txtTitle);
                        Intrinsics.f(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
                        return (TextView) viewFindViewById;
                    case 2:
                        View viewFindViewById2 = this.e.a().findViewById(R.id.txtBody);
                        Intrinsics.f(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
                        return (TextView) viewFindViewById2;
                    case 3:
                        View viewFindViewById3 = this.e.a().findViewById(R.id.txtDetails);
                        Intrinsics.f(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
                        return (TextView) viewFindViewById3;
                    case 4:
                        View viewFindViewById4 = this.e.a().findViewById(R.id.btnPositive);
                        Intrinsics.f(viewFindViewById4, "null cannot be cast to non-null type android.widget.Button");
                        return (Button) viewFindViewById4;
                    case 5:
                        View viewFindViewById5 = this.e.a().findViewById(R.id.btnNegative);
                        Intrinsics.f(viewFindViewById5, "null cannot be cast to non-null type android.widget.Button");
                        return (Button) viewFindViewById5;
                    default:
                        View viewFindViewById6 = this.e.a().findViewById(R.id.imgArrow);
                        Intrinsics.f(viewFindViewById6, "null cannot be cast to non-null type android.widget.ImageView");
                        return (ImageView) viewFindViewById6;
                }
            }
        });
        this.d = new AlertDialog.Builder(context).setView(a());
        final int i2 = 1;
        this.e = LazyKt.b(new Function0(this) { // from class: com.woolworths.scanlibrary.util.widget.e
            public final /* synthetic */ MoreDetailAlertDialogHelper e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return LayoutInflater.from(this.e.f21381a).inflate(R.layout.dialog_error_alert, (ViewGroup) null);
                    case 1:
                        View viewFindViewById = this.e.a().findViewById(R.id.txtTitle);
                        Intrinsics.f(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
                        return (TextView) viewFindViewById;
                    case 2:
                        View viewFindViewById2 = this.e.a().findViewById(R.id.txtBody);
                        Intrinsics.f(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
                        return (TextView) viewFindViewById2;
                    case 3:
                        View viewFindViewById3 = this.e.a().findViewById(R.id.txtDetails);
                        Intrinsics.f(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
                        return (TextView) viewFindViewById3;
                    case 4:
                        View viewFindViewById4 = this.e.a().findViewById(R.id.btnPositive);
                        Intrinsics.f(viewFindViewById4, "null cannot be cast to non-null type android.widget.Button");
                        return (Button) viewFindViewById4;
                    case 5:
                        View viewFindViewById5 = this.e.a().findViewById(R.id.btnNegative);
                        Intrinsics.f(viewFindViewById5, "null cannot be cast to non-null type android.widget.Button");
                        return (Button) viewFindViewById5;
                    default:
                        View viewFindViewById6 = this.e.a().findViewById(R.id.imgArrow);
                        Intrinsics.f(viewFindViewById6, "null cannot be cast to non-null type android.widget.ImageView");
                        return (ImageView) viewFindViewById6;
                }
            }
        });
        final int i3 = 2;
        this.f = LazyKt.b(new Function0(this) { // from class: com.woolworths.scanlibrary.util.widget.e
            public final /* synthetic */ MoreDetailAlertDialogHelper e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return LayoutInflater.from(this.e.f21381a).inflate(R.layout.dialog_error_alert, (ViewGroup) null);
                    case 1:
                        View viewFindViewById = this.e.a().findViewById(R.id.txtTitle);
                        Intrinsics.f(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
                        return (TextView) viewFindViewById;
                    case 2:
                        View viewFindViewById2 = this.e.a().findViewById(R.id.txtBody);
                        Intrinsics.f(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
                        return (TextView) viewFindViewById2;
                    case 3:
                        View viewFindViewById3 = this.e.a().findViewById(R.id.txtDetails);
                        Intrinsics.f(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
                        return (TextView) viewFindViewById3;
                    case 4:
                        View viewFindViewById4 = this.e.a().findViewById(R.id.btnPositive);
                        Intrinsics.f(viewFindViewById4, "null cannot be cast to non-null type android.widget.Button");
                        return (Button) viewFindViewById4;
                    case 5:
                        View viewFindViewById5 = this.e.a().findViewById(R.id.btnNegative);
                        Intrinsics.f(viewFindViewById5, "null cannot be cast to non-null type android.widget.Button");
                        return (Button) viewFindViewById5;
                    default:
                        View viewFindViewById6 = this.e.a().findViewById(R.id.imgArrow);
                        Intrinsics.f(viewFindViewById6, "null cannot be cast to non-null type android.widget.ImageView");
                        return (ImageView) viewFindViewById6;
                }
            }
        });
        final int i4 = 3;
        this.g = LazyKt.b(new Function0(this) { // from class: com.woolworths.scanlibrary.util.widget.e
            public final /* synthetic */ MoreDetailAlertDialogHelper e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return LayoutInflater.from(this.e.f21381a).inflate(R.layout.dialog_error_alert, (ViewGroup) null);
                    case 1:
                        View viewFindViewById = this.e.a().findViewById(R.id.txtTitle);
                        Intrinsics.f(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
                        return (TextView) viewFindViewById;
                    case 2:
                        View viewFindViewById2 = this.e.a().findViewById(R.id.txtBody);
                        Intrinsics.f(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
                        return (TextView) viewFindViewById2;
                    case 3:
                        View viewFindViewById3 = this.e.a().findViewById(R.id.txtDetails);
                        Intrinsics.f(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
                        return (TextView) viewFindViewById3;
                    case 4:
                        View viewFindViewById4 = this.e.a().findViewById(R.id.btnPositive);
                        Intrinsics.f(viewFindViewById4, "null cannot be cast to non-null type android.widget.Button");
                        return (Button) viewFindViewById4;
                    case 5:
                        View viewFindViewById5 = this.e.a().findViewById(R.id.btnNegative);
                        Intrinsics.f(viewFindViewById5, "null cannot be cast to non-null type android.widget.Button");
                        return (Button) viewFindViewById5;
                    default:
                        View viewFindViewById6 = this.e.a().findViewById(R.id.imgArrow);
                        Intrinsics.f(viewFindViewById6, "null cannot be cast to non-null type android.widget.ImageView");
                        return (ImageView) viewFindViewById6;
                }
            }
        });
        final int i5 = 4;
        this.h = LazyKt.b(new Function0(this) { // from class: com.woolworths.scanlibrary.util.widget.e
            public final /* synthetic */ MoreDetailAlertDialogHelper e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return LayoutInflater.from(this.e.f21381a).inflate(R.layout.dialog_error_alert, (ViewGroup) null);
                    case 1:
                        View viewFindViewById = this.e.a().findViewById(R.id.txtTitle);
                        Intrinsics.f(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
                        return (TextView) viewFindViewById;
                    case 2:
                        View viewFindViewById2 = this.e.a().findViewById(R.id.txtBody);
                        Intrinsics.f(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
                        return (TextView) viewFindViewById2;
                    case 3:
                        View viewFindViewById3 = this.e.a().findViewById(R.id.txtDetails);
                        Intrinsics.f(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
                        return (TextView) viewFindViewById3;
                    case 4:
                        View viewFindViewById4 = this.e.a().findViewById(R.id.btnPositive);
                        Intrinsics.f(viewFindViewById4, "null cannot be cast to non-null type android.widget.Button");
                        return (Button) viewFindViewById4;
                    case 5:
                        View viewFindViewById5 = this.e.a().findViewById(R.id.btnNegative);
                        Intrinsics.f(viewFindViewById5, "null cannot be cast to non-null type android.widget.Button");
                        return (Button) viewFindViewById5;
                    default:
                        View viewFindViewById6 = this.e.a().findViewById(R.id.imgArrow);
                        Intrinsics.f(viewFindViewById6, "null cannot be cast to non-null type android.widget.ImageView");
                        return (ImageView) viewFindViewById6;
                }
            }
        });
        final int i6 = 5;
        this.i = LazyKt.b(new Function0(this) { // from class: com.woolworths.scanlibrary.util.widget.e
            public final /* synthetic */ MoreDetailAlertDialogHelper e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        return LayoutInflater.from(this.e.f21381a).inflate(R.layout.dialog_error_alert, (ViewGroup) null);
                    case 1:
                        View viewFindViewById = this.e.a().findViewById(R.id.txtTitle);
                        Intrinsics.f(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
                        return (TextView) viewFindViewById;
                    case 2:
                        View viewFindViewById2 = this.e.a().findViewById(R.id.txtBody);
                        Intrinsics.f(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
                        return (TextView) viewFindViewById2;
                    case 3:
                        View viewFindViewById3 = this.e.a().findViewById(R.id.txtDetails);
                        Intrinsics.f(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
                        return (TextView) viewFindViewById3;
                    case 4:
                        View viewFindViewById4 = this.e.a().findViewById(R.id.btnPositive);
                        Intrinsics.f(viewFindViewById4, "null cannot be cast to non-null type android.widget.Button");
                        return (Button) viewFindViewById4;
                    case 5:
                        View viewFindViewById5 = this.e.a().findViewById(R.id.btnNegative);
                        Intrinsics.f(viewFindViewById5, "null cannot be cast to non-null type android.widget.Button");
                        return (Button) viewFindViewById5;
                    default:
                        View viewFindViewById6 = this.e.a().findViewById(R.id.imgArrow);
                        Intrinsics.f(viewFindViewById6, "null cannot be cast to non-null type android.widget.ImageView");
                        return (ImageView) viewFindViewById6;
                }
            }
        });
        final int i7 = 6;
        this.j = LazyKt.b(new Function0(this) { // from class: com.woolworths.scanlibrary.util.widget.e
            public final /* synthetic */ MoreDetailAlertDialogHelper e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return LayoutInflater.from(this.e.f21381a).inflate(R.layout.dialog_error_alert, (ViewGroup) null);
                    case 1:
                        View viewFindViewById = this.e.a().findViewById(R.id.txtTitle);
                        Intrinsics.f(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
                        return (TextView) viewFindViewById;
                    case 2:
                        View viewFindViewById2 = this.e.a().findViewById(R.id.txtBody);
                        Intrinsics.f(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
                        return (TextView) viewFindViewById2;
                    case 3:
                        View viewFindViewById3 = this.e.a().findViewById(R.id.txtDetails);
                        Intrinsics.f(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
                        return (TextView) viewFindViewById3;
                    case 4:
                        View viewFindViewById4 = this.e.a().findViewById(R.id.btnPositive);
                        Intrinsics.f(viewFindViewById4, "null cannot be cast to non-null type android.widget.Button");
                        return (Button) viewFindViewById4;
                    case 5:
                        View viewFindViewById5 = this.e.a().findViewById(R.id.btnNegative);
                        Intrinsics.f(viewFindViewById5, "null cannot be cast to non-null type android.widget.Button");
                        return (Button) viewFindViewById5;
                    default:
                        View viewFindViewById6 = this.e.a().findViewById(R.id.imgArrow);
                        Intrinsics.f(viewFindViewById6, "null cannot be cast to non-null type android.widget.ImageView");
                        return (ImageView) viewFindViewById6;
                }
            }
        });
    }

    public final View a() {
        Object d = this.c.getD();
        Intrinsics.g(d, "getValue(...)");
        return (View) d;
    }
}
