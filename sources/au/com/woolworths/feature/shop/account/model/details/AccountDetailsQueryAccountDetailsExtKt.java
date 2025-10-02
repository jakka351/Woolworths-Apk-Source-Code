package au.com.woolworths.feature.shop.account.model.details;

import au.com.woolworths.feature.shop.account.model.details.AccountFeedItem;
import au.com.woolworths.sdui.common.IconAsset;
import au.com.woolworths.sdui.common.corerow.model.CoreRowModel;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.model.action.ActionType;
import au.com.woolworths.shop.aem.components.model.button.ButtonData;
import au.com.woolworths.shop.aem.components.model.button.ButtonStyle;
import com.woolworths.feature.shop.account.AccountDetailsQuery;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"account_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AccountDetailsQueryAccountDetailsExtKt {
    public static final AccountDetailsData a(AccountDetailsQuery.AccountDetails accountDetails) {
        ButtonStyle buttonStyle;
        ActionData actionData;
        IconAsset iconAsset;
        IconAsset iconAsset2;
        IconAsset coreIcon;
        IconAsset coreIcon2;
        IconAsset iconAsset3;
        IconAsset iconAsset4;
        IconAsset coreIcon3;
        IconAsset coreIcon4;
        IconAsset iconAsset5;
        IconAsset iconAsset6;
        IconAsset coreIcon5;
        IconAsset coreIcon6;
        IconAsset iconAsset7;
        IconAsset iconAsset8;
        IconAsset coreIcon7;
        IconAsset coreIcon8;
        ArrayList<AccountDetailsQuery.Feed> arrayList = accountDetails.f19303a;
        ArrayList arrayList2 = new ArrayList();
        for (AccountDetailsQuery.Feed feed : arrayList) {
            AccountFeedItem accountFooter = null;
            if ((feed != null ? feed.b : null) != null) {
                AccountDetailsQuery.OnMyAccountPersonalDetails onMyAccountPersonalDetails = feed.b;
                Intrinsics.h(onMyAccountPersonalDetails, "<this>");
                String str = onMyAccountPersonalDetails.f19331a;
                String str2 = onMyAccountPersonalDetails.b;
                ArrayList<AccountDetailsQuery.RowItem> arrayList3 = onMyAccountPersonalDetails.c;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.s(arrayList3, 10));
                for (AccountDetailsQuery.RowItem rowItem : arrayList3) {
                    Intrinsics.h(rowItem, "<this>");
                    String str3 = rowItem.d;
                    AccountDetailsQuery.LeadingAsset leadingAsset = rowItem.c;
                    if (leadingAsset != null) {
                        AccountDetailsQuery.OnHostedIcon onHostedIcon = leadingAsset.b;
                        if (onHostedIcon != null) {
                            coreIcon8 = new IconAsset.HostedIcon(onHostedIcon.f19320a);
                        } else {
                            AccountDetailsQuery.OnCoreIcon onCoreIcon = leadingAsset.c;
                            coreIcon8 = onCoreIcon != null ? new IconAsset.CoreIcon(onCoreIcon.f19312a) : null;
                        }
                        iconAsset7 = coreIcon8;
                    } else {
                        iconAsset7 = null;
                    }
                    String str4 = rowItem.f19333a;
                    String str5 = rowItem.b;
                    AccountDetailsQuery.TrailingAsset trailingAsset = rowItem.e;
                    if (trailingAsset != null) {
                        AccountDetailsQuery.OnHostedIcon1 onHostedIcon1 = trailingAsset.b;
                        if (onHostedIcon1 != null) {
                            coreIcon7 = new IconAsset.HostedIcon(onHostedIcon1.f19321a);
                        } else {
                            AccountDetailsQuery.OnCoreIcon1 onCoreIcon1 = trailingAsset.c;
                            coreIcon7 = onCoreIcon1 != null ? new IconAsset.CoreIcon(onCoreIcon1.f19313a) : null;
                        }
                        iconAsset8 = coreIcon7;
                    } else {
                        iconAsset8 = null;
                    }
                    arrayList4.add(new CoreRowModel(str3, iconAsset7, str4, str5, iconAsset8, null));
                }
                accountFooter = new AccountFeedItem.AccountPersonalDetails(str, str2, arrayList4);
            } else if ((feed != null ? feed.c : null) != null) {
                AccountDetailsQuery.OnMyAccountBusinessDetails onMyAccountBusinessDetails = feed.c;
                Intrinsics.h(onMyAccountBusinessDetails, "<this>");
                String str6 = onMyAccountBusinessDetails.f19328a;
                String str7 = onMyAccountBusinessDetails.b;
                ArrayList<AccountDetailsQuery.RowItem1> arrayList5 = onMyAccountBusinessDetails.c;
                ArrayList arrayList6 = new ArrayList(CollectionsKt.s(arrayList5, 10));
                for (AccountDetailsQuery.RowItem1 rowItem1 : arrayList5) {
                    Intrinsics.h(rowItem1, "<this>");
                    String str8 = rowItem1.d;
                    AccountDetailsQuery.LeadingAsset1 leadingAsset1 = rowItem1.c;
                    if (leadingAsset1 != null) {
                        AccountDetailsQuery.OnHostedIcon2 onHostedIcon2 = leadingAsset1.b;
                        if (onHostedIcon2 != null) {
                            coreIcon6 = new IconAsset.HostedIcon(onHostedIcon2.f19322a);
                        } else {
                            AccountDetailsQuery.OnCoreIcon2 onCoreIcon2 = leadingAsset1.c;
                            coreIcon6 = onCoreIcon2 != null ? new IconAsset.CoreIcon(onCoreIcon2.f19314a) : null;
                        }
                        iconAsset5 = coreIcon6;
                    } else {
                        iconAsset5 = null;
                    }
                    String str9 = rowItem1.f19334a;
                    String str10 = rowItem1.b;
                    AccountDetailsQuery.TrailingAsset1 trailingAsset1 = rowItem1.e;
                    if (trailingAsset1 != null) {
                        AccountDetailsQuery.OnHostedIcon3 onHostedIcon3 = trailingAsset1.b;
                        if (onHostedIcon3 != null) {
                            coreIcon5 = new IconAsset.HostedIcon(onHostedIcon3.f19323a);
                        } else {
                            AccountDetailsQuery.OnCoreIcon3 onCoreIcon3 = trailingAsset1.c;
                            coreIcon5 = onCoreIcon3 != null ? new IconAsset.CoreIcon(onCoreIcon3.f19315a) : null;
                        }
                        iconAsset6 = coreIcon5;
                    } else {
                        iconAsset6 = null;
                    }
                    arrayList6.add(new CoreRowModel(str8, iconAsset5, str9, str10, iconAsset6, null));
                }
                accountFooter = new AccountFeedItem.AccountBusinessDetails(str6, str7, arrayList6);
            } else if ((feed != null ? feed.d : null) != null) {
                AccountDetailsQuery.OnMyAccountContactDetails onMyAccountContactDetails = feed.d;
                Intrinsics.h(onMyAccountContactDetails, "<this>");
                String str11 = onMyAccountContactDetails.f19329a;
                String str12 = onMyAccountContactDetails.b;
                ArrayList<AccountDetailsQuery.RowItem2> arrayList7 = onMyAccountContactDetails.c;
                ArrayList arrayList8 = new ArrayList(CollectionsKt.s(arrayList7, 10));
                for (AccountDetailsQuery.RowItem2 rowItem2 : arrayList7) {
                    Intrinsics.h(rowItem2, "<this>");
                    String str13 = rowItem2.d;
                    AccountDetailsQuery.LeadingAsset2 leadingAsset2 = rowItem2.c;
                    if (leadingAsset2 != null) {
                        AccountDetailsQuery.OnHostedIcon4 onHostedIcon4 = leadingAsset2.b;
                        if (onHostedIcon4 != null) {
                            coreIcon4 = new IconAsset.HostedIcon(onHostedIcon4.f19324a);
                        } else {
                            AccountDetailsQuery.OnCoreIcon4 onCoreIcon4 = leadingAsset2.c;
                            coreIcon4 = onCoreIcon4 != null ? new IconAsset.CoreIcon(onCoreIcon4.f19316a) : null;
                        }
                        iconAsset3 = coreIcon4;
                    } else {
                        iconAsset3 = null;
                    }
                    String str14 = rowItem2.f19335a;
                    String str15 = rowItem2.b;
                    AccountDetailsQuery.TrailingAsset2 trailingAsset2 = rowItem2.e;
                    if (trailingAsset2 != null) {
                        AccountDetailsQuery.OnHostedIcon5 onHostedIcon5 = trailingAsset2.b;
                        if (onHostedIcon5 != null) {
                            coreIcon3 = new IconAsset.HostedIcon(onHostedIcon5.f19325a);
                        } else {
                            AccountDetailsQuery.OnCoreIcon5 onCoreIcon5 = trailingAsset2.c;
                            coreIcon3 = onCoreIcon5 != null ? new IconAsset.CoreIcon(onCoreIcon5.f19317a) : null;
                        }
                        iconAsset4 = coreIcon3;
                    } else {
                        iconAsset4 = null;
                    }
                    arrayList8.add(new CoreRowModel(str13, iconAsset3, str14, str15, iconAsset4, null));
                }
                accountFooter = new AccountFeedItem.AccountContactDetails(str11, str12, arrayList8);
            } else if ((feed != null ? feed.e : null) != null) {
                AccountDetailsQuery.OnMyAccountPreferences onMyAccountPreferences = feed.e;
                Intrinsics.h(onMyAccountPreferences, "<this>");
                String str16 = onMyAccountPreferences.f19332a;
                String str17 = onMyAccountPreferences.b;
                ArrayList<AccountDetailsQuery.RowItem3> arrayList9 = onMyAccountPreferences.c;
                ArrayList arrayList10 = new ArrayList(CollectionsKt.s(arrayList9, 10));
                for (AccountDetailsQuery.RowItem3 rowItem3 : arrayList9) {
                    Intrinsics.h(rowItem3, "<this>");
                    String str18 = rowItem3.d;
                    AccountDetailsQuery.LeadingAsset3 leadingAsset3 = rowItem3.c;
                    if (leadingAsset3 != null) {
                        AccountDetailsQuery.OnHostedIcon6 onHostedIcon6 = leadingAsset3.b;
                        if (onHostedIcon6 != null) {
                            coreIcon2 = new IconAsset.HostedIcon(onHostedIcon6.f19326a);
                        } else {
                            AccountDetailsQuery.OnCoreIcon6 onCoreIcon6 = leadingAsset3.c;
                            coreIcon2 = onCoreIcon6 != null ? new IconAsset.CoreIcon(onCoreIcon6.f19318a) : null;
                        }
                        iconAsset = coreIcon2;
                    } else {
                        iconAsset = null;
                    }
                    String str19 = rowItem3.f19336a;
                    String str20 = rowItem3.b;
                    AccountDetailsQuery.TrailingAsset3 trailingAsset3 = rowItem3.e;
                    if (trailingAsset3 != null) {
                        AccountDetailsQuery.OnHostedIcon7 onHostedIcon7 = trailingAsset3.b;
                        if (onHostedIcon7 != null) {
                            coreIcon = new IconAsset.HostedIcon(onHostedIcon7.f19327a);
                        } else {
                            AccountDetailsQuery.OnCoreIcon7 onCoreIcon7 = trailingAsset3.c;
                            coreIcon = onCoreIcon7 != null ? new IconAsset.CoreIcon(onCoreIcon7.f19319a) : null;
                        }
                        iconAsset2 = coreIcon;
                    } else {
                        iconAsset2 = null;
                    }
                    arrayList10.add(new CoreRowModel(str18, iconAsset, str19, str20, iconAsset2, null));
                }
                accountFooter = new AccountFeedItem.AccountPreferences(str16, str17, arrayList10);
            } else if ((feed != null ? feed.f : null) != null) {
                AccountDetailsQuery.OnMyAccountFooter onMyAccountFooter = feed.f;
                Intrinsics.h(onMyAccountFooter, "<this>");
                AccountDetailsQuery.Button button = onMyAccountFooter.f19330a;
                String str21 = button.f19304a;
                au.com.woolworths.shop.graphql.type.ButtonStyle buttonStyle2 = button.b;
                if (buttonStyle2 != null) {
                    int iOrdinal = buttonStyle2.ordinal();
                    buttonStyle = iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? iOrdinal != 5 ? ButtonStyle.j : ButtonStyle.i : ButtonStyle.h : ButtonStyle.g : ButtonStyle.f : ButtonStyle.e : ButtonStyle.d;
                } else {
                    buttonStyle = null;
                }
                boolean z = button.c;
                AccountDetailsQuery.ButtonAction buttonAction = button.d;
                if (buttonAction != null) {
                    String str22 = buttonAction.b;
                    int iOrdinal2 = buttonAction.c.ordinal();
                    ActionType actionType = (iOrdinal2 == 0 || iOrdinal2 != 1) ? ActionType.e : ActionType.d;
                    actionData = new ActionData(str22, actionType, buttonAction.f19305a, null);
                } else {
                    actionData = null;
                }
                accountFooter = new AccountFeedItem.AccountFooter(new ButtonData(null, str21, buttonStyle, z, actionData, button.e, null, null));
            }
            if (accountFooter != null) {
                arrayList2.add(accountFooter);
            }
        }
        return new AccountDetailsData(arrayList2);
    }
}
