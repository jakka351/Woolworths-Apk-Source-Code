package au.com.woolworths.feature.rewards.account.preferences;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.base.rewards.account.data.PreferenceDetailsAnalyticsData;
import au.com.woolworths.base.rewards.account.data.PreferenceToggleData;
import au.com.woolworths.feature.rewards.account.preferences.data.PreferenceDetailsData;
import au.com.woolworths.feature.rewards.account.preferences.data.PreferenceDetailsFooterData;
import au.com.woolworths.feature.rewards.account.preferences.data.PreferenceDetailsHeaderData;
import au.com.woolworths.feature.rewards.account.preferences.data.PreferenceDetailsTextData;
import au.com.woolworths.feature.rewards.account.preferences.data.PreferenceDetailsToggleGroupData;
import au.com.woolworths.rewards.base.data.RewardsWebLink;
import com.apollographql.apollo.ApolloClient;
import com.woolworths.rewards.account.PreferenceDetailsQuery;
import com.woolworths.rewards.account.PreferenceUpdateMutation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsRepository;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsPreferenceDetailsRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f5742a;
    public final DispatcherProvider b;
    public final SharedFlowImpl c;

    public RewardsPreferenceDetailsRepository(DispatcherProvider dispatcherProvider, ApolloClient apolloClient) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        this.f5742a = apolloClient;
        this.b = dispatcherProvider;
        this.c = SharedFlowKt.b(0, 0, null, 6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.ArrayList] */
    public static final PreferenceDetailsData a(RewardsPreferenceDetailsRepository rewardsPreferenceDetailsRepository, PreferenceDetailsQuery.PreferenceDetails preferenceDetails) {
        EmptyList emptyList;
        Iterator it;
        EmptyList emptyList2;
        Object preferenceDetailsFooterData;
        ?? arrayList;
        Iterator it2;
        EmptyList emptyList3;
        PreferenceToggleData preferenceToggleData;
        rewardsPreferenceDetailsRepository.getClass();
        String str = preferenceDetails.f20550a;
        List list = preferenceDetails.b;
        EmptyList emptyList4 = EmptyList.d;
        if (list != null) {
            ?? arrayList2 = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                PreferenceDetailsQuery.Detail detail = (PreferenceDetailsQuery.Detail) it3.next();
                if ((detail != null ? detail.b : null) != null) {
                    PreferenceDetailsQuery.OnPreferenceDetailsHeader onPreferenceDetailsHeader = detail.b;
                    Intrinsics.h(onPreferenceDetailsHeader, "<this>");
                    preferenceDetailsFooterData = new PreferenceDetailsHeaderData(onPreferenceDetailsHeader.c, onPreferenceDetailsHeader.f20547a, onPreferenceDetailsHeader.b, onPreferenceDetailsHeader.d);
                    it = it3;
                    emptyList2 = emptyList4;
                } else if ((detail != null ? detail.c : null) != null) {
                    PreferenceDetailsQuery.OnPreferenceDetailsToggleGroup onPreferenceDetailsToggleGroup = detail.c;
                    Intrinsics.h(onPreferenceDetailsToggleGroup, "<this>");
                    String str2 = onPreferenceDetailsToggleGroup.f20549a;
                    String str3 = onPreferenceDetailsToggleGroup.b;
                    List<PreferenceDetailsQuery.Toggle> list2 = onPreferenceDetailsToggleGroup.c;
                    if (list2 != null) {
                        arrayList = new ArrayList();
                        for (PreferenceDetailsQuery.Toggle toggle : list2) {
                            if (toggle != null) {
                                String str4 = toggle.f20551a;
                                String str5 = toggle.b;
                                boolean z = toggle.c;
                                String str6 = toggle.d;
                                it2 = it3;
                                String str7 = toggle.e;
                                PreferenceDetailsQuery.Analytics analytics = toggle.f;
                                Intrinsics.h(analytics, "<this>");
                                emptyList3 = emptyList4;
                                preferenceToggleData = new PreferenceToggleData(str4, str5, z, str6, str7, new PreferenceDetailsAnalyticsData(analytics.f20542a), toggle.g);
                            } else {
                                it2 = it3;
                                emptyList3 = emptyList4;
                                preferenceToggleData = null;
                            }
                            if (preferenceToggleData != null) {
                                arrayList.add(preferenceToggleData);
                            }
                            it3 = it2;
                            emptyList4 = emptyList3;
                        }
                    } else {
                        arrayList = 0;
                    }
                    it = it3;
                    emptyList2 = emptyList4;
                    EmptyList emptyList5 = arrayList;
                    if (arrayList == 0) {
                        emptyList5 = emptyList2;
                    }
                    preferenceDetailsFooterData = new PreferenceDetailsToggleGroupData(str2, str3, emptyList5);
                } else {
                    it = it3;
                    emptyList2 = emptyList4;
                    if ((detail != null ? detail.d : null) != null) {
                        PreferenceDetailsQuery.OnPreferenceDetailsText onPreferenceDetailsText = detail.d;
                        Intrinsics.h(onPreferenceDetailsText, "<this>");
                        preferenceDetailsFooterData = new PreferenceDetailsTextData(onPreferenceDetailsText.f20548a, onPreferenceDetailsText.b);
                    } else if ((detail != null ? detail.e : null) != null) {
                        PreferenceDetailsQuery.OnPreferenceDetailsFooter onPreferenceDetailsFooter = detail.e;
                        Intrinsics.h(onPreferenceDetailsFooter, "<this>");
                        String str8 = onPreferenceDetailsFooter.f20546a;
                        PreferenceDetailsQuery.Button button = onPreferenceDetailsFooter.b;
                        preferenceDetailsFooterData = new PreferenceDetailsFooterData(str8, button != null ? new RewardsWebLink(button.f20543a, button.b) : null);
                    } else {
                        preferenceDetailsFooterData = null;
                    }
                }
                if (preferenceDetailsFooterData != null) {
                    arrayList2.add(preferenceDetailsFooterData);
                }
                it3 = it;
                emptyList4 = emptyList2;
            }
            emptyList = arrayList2;
        } else {
            emptyList = null;
        }
        return new PreferenceDetailsData(str, emptyList == null ? emptyList4 : emptyList, preferenceDetails.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.ArrayList] */
    public static final PreferenceDetailsData b(RewardsPreferenceDetailsRepository rewardsPreferenceDetailsRepository, PreferenceUpdateMutation.UpdatePreference updatePreference) {
        EmptyList emptyList;
        Iterator it;
        EmptyList emptyList2;
        Object preferenceDetailsFooterData;
        ?? arrayList;
        Iterator it2;
        EmptyList emptyList3;
        PreferenceToggleData preferenceToggleData;
        rewardsPreferenceDetailsRepository.getClass();
        String str = updatePreference.f20562a;
        List list = updatePreference.b;
        EmptyList emptyList4 = EmptyList.d;
        if (list != null) {
            ?? arrayList2 = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                PreferenceUpdateMutation.Detail detail = (PreferenceUpdateMutation.Detail) it3.next();
                if ((detail != null ? detail.b : null) != null) {
                    PreferenceUpdateMutation.OnPreferenceDetailsHeader onPreferenceDetailsHeader = detail.b;
                    Intrinsics.h(onPreferenceDetailsHeader, "<this>");
                    preferenceDetailsFooterData = new PreferenceDetailsHeaderData(onPreferenceDetailsHeader.c, onPreferenceDetailsHeader.f20558a, onPreferenceDetailsHeader.b, onPreferenceDetailsHeader.d);
                    it = it3;
                    emptyList2 = emptyList4;
                } else if ((detail != null ? detail.c : null) != null) {
                    PreferenceUpdateMutation.OnPreferenceDetailsToggleGroup onPreferenceDetailsToggleGroup = detail.c;
                    Intrinsics.h(onPreferenceDetailsToggleGroup, "<this>");
                    String str2 = onPreferenceDetailsToggleGroup.f20560a;
                    String str3 = onPreferenceDetailsToggleGroup.b;
                    List<PreferenceUpdateMutation.Toggle> list2 = onPreferenceDetailsToggleGroup.c;
                    if (list2 != null) {
                        arrayList = new ArrayList();
                        for (PreferenceUpdateMutation.Toggle toggle : list2) {
                            if (toggle != null) {
                                String str4 = toggle.f20561a;
                                String str5 = toggle.b;
                                boolean z = toggle.c;
                                String str6 = toggle.d;
                                it2 = it3;
                                String str7 = toggle.e;
                                PreferenceUpdateMutation.Analytics analytics = toggle.f;
                                Intrinsics.h(analytics, "<this>");
                                emptyList3 = emptyList4;
                                preferenceToggleData = new PreferenceToggleData(str4, str5, z, str6, str7, new PreferenceDetailsAnalyticsData(analytics.f20553a), toggle.g);
                            } else {
                                it2 = it3;
                                emptyList3 = emptyList4;
                                preferenceToggleData = null;
                            }
                            if (preferenceToggleData != null) {
                                arrayList.add(preferenceToggleData);
                            }
                            it3 = it2;
                            emptyList4 = emptyList3;
                        }
                    } else {
                        arrayList = 0;
                    }
                    it = it3;
                    emptyList2 = emptyList4;
                    EmptyList emptyList5 = arrayList;
                    if (arrayList == 0) {
                        emptyList5 = emptyList2;
                    }
                    preferenceDetailsFooterData = new PreferenceDetailsToggleGroupData(str2, str3, emptyList5);
                } else {
                    it = it3;
                    emptyList2 = emptyList4;
                    if ((detail != null ? detail.d : null) != null) {
                        PreferenceUpdateMutation.OnPreferenceDetailsText onPreferenceDetailsText = detail.d;
                        Intrinsics.h(onPreferenceDetailsText, "<this>");
                        preferenceDetailsFooterData = new PreferenceDetailsTextData(onPreferenceDetailsText.f20559a, onPreferenceDetailsText.b);
                    } else if ((detail != null ? detail.e : null) != null) {
                        PreferenceUpdateMutation.OnPreferenceDetailsFooter onPreferenceDetailsFooter = detail.e;
                        Intrinsics.h(onPreferenceDetailsFooter, "<this>");
                        String str8 = onPreferenceDetailsFooter.f20557a;
                        PreferenceUpdateMutation.Button button = onPreferenceDetailsFooter.b;
                        preferenceDetailsFooterData = new PreferenceDetailsFooterData(str8, button != null ? new RewardsWebLink(button.f20554a, button.b) : null);
                    } else {
                        preferenceDetailsFooterData = null;
                    }
                }
                if (preferenceDetailsFooterData != null) {
                    arrayList2.add(preferenceDetailsFooterData);
                }
                it3 = it;
                emptyList4 = emptyList2;
            }
            emptyList = arrayList2;
        } else {
            emptyList = null;
        }
        return new PreferenceDetailsData(str, emptyList == null ? emptyList4 : emptyList, updatePreference.c);
    }
}
