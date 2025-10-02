package au.com.woolworths.rewards.base.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.rewards.graphql.type.GraphQLString;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/base/selections/FetchFeatureAccesslistQuerySelections;", "", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FetchFeatureAccesslistQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f9378a;

    static {
        CustomScalarType customScalarType = GraphQLString.f9617a;
        f9378a = CollectionsKt.R(new CompiledField.Builder("featureAccessList", a.e(customScalarType)).c(), new CompiledField.Builder("allFeaturesInAccessList", a.e(customScalarType)).c());
    }
}
