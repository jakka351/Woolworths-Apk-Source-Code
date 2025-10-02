package au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import com.halilibo.richtext.ui.FormattedListKt;
import com.halilibo.richtext.ui.ListType;
import com.halilibo.richtext.ui.RichTextScope;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Function k;

    public /* synthetic */ a(RichTextScope richTextScope, ListType listType, List list, int i, ComposableLambdaImpl composableLambdaImpl, int i2, int i3) {
        this.h = richTextScope;
        this.i = listType;
        this.j = list;
        this.e = i;
        this.k = composableLambdaImpl;
        this.f = i2;
        this.g = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                RatingSubmissionKt.b((String) this.h, this.e, (Modifier) this.j, (String) this.i, (Function1) this.k, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1), this.g);
                break;
            default:
                ((Integer) obj2).getClass();
                FormattedListKt.a((RichTextScope) this.h, (ListType) this.i, (List) this.j, this.e, (ComposableLambdaImpl) this.k, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1), this.g);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(String str, int i, Modifier modifier, String str2, Function1 function1, int i2, int i3) {
        this.h = str;
        this.e = i;
        this.j = modifier;
        this.i = str2;
        this.k = function1;
        this.f = i2;
        this.g = i3;
    }
}
