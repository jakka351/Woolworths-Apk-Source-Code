package au.com.woolworths.feature.shop.myorders.details.substitutionrating;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "preferences", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.details.substitutionrating.SubstitutionRatingRepository$addSubstitutionRating$2", f = "SubstitutionRatingRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SubstitutionRatingRepository$addSubstitutionRating$2 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ String q;
    public final /* synthetic */ String r;
    public final /* synthetic */ boolean s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubstitutionRatingRepository$addSubstitutionRating$2(String str, String str2, boolean z, Continuation continuation) {
        super(2, continuation);
        this.q = str;
        this.r = str2;
        this.s = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SubstitutionRatingRepository$addSubstitutionRating$2 substitutionRatingRepository$addSubstitutionRating$2 = new SubstitutionRatingRepository$addSubstitutionRating$2(this.q, this.r, this.s, continuation);
        substitutionRatingRepository$addSubstitutionRating$2.p = obj;
        return substitutionRatingRepository$addSubstitutionRating$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SubstitutionRatingRepository$addSubstitutionRating$2 substitutionRatingRepository$addSubstitutionRating$2 = (SubstitutionRatingRepository$addSubstitutionRating$2) create((MutablePreferences) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        substitutionRatingRepository$addSubstitutionRating$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        MutablePreferences mutablePreferences = (MutablePreferences) this.p;
        Preferences.Key keyA = PreferencesKeys.a(this.q + "-" + this.r);
        Boolean boolValueOf = Boolean.valueOf(this.s);
        mutablePreferences.getClass();
        mutablePreferences.f(keyA, boolValueOf);
        return Unit.f24250a;
    }
}
