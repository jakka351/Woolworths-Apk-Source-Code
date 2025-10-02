package au.com.woolworths.foundation.shop.olive.voice.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.Query;
import au.com.woolworths.shop.graphql.type.VoiceSearchResult;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/selections/VoiceSearchQuerySelections;", "", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VoiceSearchQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f8836a;
    public static final List b;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        CompiledField compiledFieldC = new CompiledField.Builder(lqlqqlq.m006Dm006Dm006Dm, CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder = new CompiledField.Builder("selectedChips", a.e(customScalarType));
        builder.c = a.s("includeSelectedChipsSearchFilter", false);
        List listR = CollectionsKt.R(compiledFieldC, builder.c());
        f8836a = listR;
        CompiledField.Builder builder2 = new CompiledField.Builder("voiceSearch", VoiceSearchResult.f12013a);
        new CompiledArgument.Builder(Query.B1);
        builder2.d = au.com.woolworths.android.onesite.a.v();
        builder2.e = listR;
        b = CollectionsKt.Q(builder2.c());
    }
}
