package au.com.woolworths.feature.shop.inbox;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.foundation.appcomms.inbox.client.model.InboxMessage;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0082\u0001\u000f\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006 À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/InboxUiEvent;", "", "Refresh", "SyncMessageUsBanner", "DismissTransientError", "RecordSeenItems", "SaveRecordedSeenItems", "ClickMessageCta", "ClickTncsButton", "DeleteItem", "ClickDeleteAllButton", "ConfirmDeleteAll", "CancelDeleteAll", "TrackMessageUsBannerView", "ClickMessageUsBanner", "TrackScreenView", "TrackTncsScreenView", "Lau/com/woolworths/feature/shop/inbox/InboxUiEvent$CancelDeleteAll;", "Lau/com/woolworths/feature/shop/inbox/InboxUiEvent$ClickDeleteAllButton;", "Lau/com/woolworths/feature/shop/inbox/InboxUiEvent$ClickMessageCta;", "Lau/com/woolworths/feature/shop/inbox/InboxUiEvent$ClickMessageUsBanner;", "Lau/com/woolworths/feature/shop/inbox/InboxUiEvent$ClickTncsButton;", "Lau/com/woolworths/feature/shop/inbox/InboxUiEvent$ConfirmDeleteAll;", "Lau/com/woolworths/feature/shop/inbox/InboxUiEvent$DeleteItem;", "Lau/com/woolworths/feature/shop/inbox/InboxUiEvent$DismissTransientError;", "Lau/com/woolworths/feature/shop/inbox/InboxUiEvent$RecordSeenItems;", "Lau/com/woolworths/feature/shop/inbox/InboxUiEvent$Refresh;", "Lau/com/woolworths/feature/shop/inbox/InboxUiEvent$SaveRecordedSeenItems;", "Lau/com/woolworths/feature/shop/inbox/InboxUiEvent$SyncMessageUsBanner;", "Lau/com/woolworths/feature/shop/inbox/InboxUiEvent$TrackMessageUsBannerView;", "Lau/com/woolworths/feature/shop/inbox/InboxUiEvent$TrackScreenView;", "Lau/com/woolworths/feature/shop/inbox/InboxUiEvent$TrackTncsScreenView;", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface InboxUiEvent {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/InboxUiEvent$CancelDeleteAll;", "Lau/com/woolworths/feature/shop/inbox/InboxUiEvent;", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CancelDeleteAll implements InboxUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final CancelDeleteAll f7266a = new CancelDeleteAll();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CancelDeleteAll);
        }

        public final int hashCode() {
            return -151216823;
        }

        public final String toString() {
            return "CancelDeleteAll";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/InboxUiEvent$ClickDeleteAllButton;", "Lau/com/woolworths/feature/shop/inbox/InboxUiEvent;", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ClickDeleteAllButton implements InboxUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final ClickDeleteAllButton f7267a = new ClickDeleteAllButton();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ClickDeleteAllButton);
        }

        public final int hashCode() {
            return -652032621;
        }

        public final String toString() {
            return "ClickDeleteAllButton";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/InboxUiEvent$ClickMessageCta;", "Lau/com/woolworths/feature/shop/inbox/InboxUiEvent;", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ClickMessageCta implements InboxUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final InboxMessage f7268a;

        public ClickMessageCta(InboxMessage inboxMessage) {
            this.f7268a = inboxMessage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClickMessageCta) && Intrinsics.c(this.f7268a, ((ClickMessageCta) obj).f7268a);
        }

        public final int hashCode() {
            return this.f7268a.hashCode();
        }

        public final String toString() {
            return "ClickMessageCta(message=" + this.f7268a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/InboxUiEvent$ClickMessageUsBanner;", "Lau/com/woolworths/feature/shop/inbox/InboxUiEvent;", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ClickMessageUsBanner implements InboxUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final ClickMessageUsBanner f7269a = new ClickMessageUsBanner();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ClickMessageUsBanner);
        }

        public final int hashCode() {
            return -1001200804;
        }

        public final String toString() {
            return "ClickMessageUsBanner";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/InboxUiEvent$ClickTncsButton;", "Lau/com/woolworths/feature/shop/inbox/InboxUiEvent;", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ClickTncsButton implements InboxUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final InboxMessage f7270a;

        public ClickTncsButton(InboxMessage inboxMessage) {
            this.f7270a = inboxMessage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClickTncsButton) && Intrinsics.c(this.f7270a, ((ClickTncsButton) obj).f7270a);
        }

        public final int hashCode() {
            return this.f7270a.hashCode();
        }

        public final String toString() {
            return "ClickTncsButton(message=" + this.f7270a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/InboxUiEvent$ConfirmDeleteAll;", "Lau/com/woolworths/feature/shop/inbox/InboxUiEvent;", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConfirmDeleteAll implements InboxUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final ConfirmDeleteAll f7271a = new ConfirmDeleteAll();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ConfirmDeleteAll);
        }

        public final int hashCode() {
            return -1079946231;
        }

        public final String toString() {
            return "ConfirmDeleteAll";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/InboxUiEvent$DeleteItem;", "Lau/com/woolworths/feature/shop/inbox/InboxUiEvent;", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeleteItem implements InboxUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final InboxMessage f7272a;

        public DeleteItem(InboxMessage inboxMessage) {
            this.f7272a = inboxMessage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeleteItem) && Intrinsics.c(this.f7272a, ((DeleteItem) obj).f7272a);
        }

        public final int hashCode() {
            return this.f7272a.hashCode();
        }

        public final String toString() {
            return "DeleteItem(message=" + this.f7272a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/InboxUiEvent$DismissTransientError;", "Lau/com/woolworths/feature/shop/inbox/InboxUiEvent;", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DismissTransientError implements InboxUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final DismissTransientError f7273a = new DismissTransientError();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissTransientError);
        }

        public final int hashCode() {
            return -652738635;
        }

        public final String toString() {
            return "DismissTransientError";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/InboxUiEvent$RecordSeenItems;", "Lau/com/woolworths/feature/shop/inbox/InboxUiEvent;", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RecordSeenItems implements InboxUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f7274a;

        public RecordSeenItems(ArrayList arrayList) {
            this.f7274a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RecordSeenItems) && this.f7274a.equals(((RecordSeenItems) obj).f7274a);
        }

        public final int hashCode() {
            return this.f7274a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.k("RecordSeenItems(messageIds=", ")", this.f7274a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/InboxUiEvent$Refresh;", "Lau/com/woolworths/feature/shop/inbox/InboxUiEvent;", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Refresh implements InboxUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final Refresh f7275a = new Refresh();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Refresh);
        }

        public final int hashCode() {
            return 1427995272;
        }

        public final String toString() {
            return "Refresh";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/InboxUiEvent$SaveRecordedSeenItems;", "Lau/com/woolworths/feature/shop/inbox/InboxUiEvent;", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SaveRecordedSeenItems implements InboxUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final SaveRecordedSeenItems f7276a = new SaveRecordedSeenItems();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SaveRecordedSeenItems);
        }

        public final int hashCode() {
            return 597669925;
        }

        public final String toString() {
            return "SaveRecordedSeenItems";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/InboxUiEvent$SyncMessageUsBanner;", "Lau/com/woolworths/feature/shop/inbox/InboxUiEvent;", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SyncMessageUsBanner implements InboxUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final SyncMessageUsBanner f7277a = new SyncMessageUsBanner();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SyncMessageUsBanner);
        }

        public final int hashCode() {
            return 124745891;
        }

        public final String toString() {
            return "SyncMessageUsBanner";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/InboxUiEvent$TrackMessageUsBannerView;", "Lau/com/woolworths/feature/shop/inbox/InboxUiEvent;", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TrackMessageUsBannerView implements InboxUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final TrackMessageUsBannerView f7278a = new TrackMessageUsBannerView();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TrackMessageUsBannerView);
        }

        public final int hashCode() {
            return 343458686;
        }

        public final String toString() {
            return "TrackMessageUsBannerView";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/InboxUiEvent$TrackScreenView;", "Lau/com/woolworths/feature/shop/inbox/InboxUiEvent;", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TrackScreenView implements InboxUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final TrackScreenView f7279a = new TrackScreenView();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TrackScreenView);
        }

        public final int hashCode() {
            return 1004810121;
        }

        public final String toString() {
            return "TrackScreenView";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/InboxUiEvent$TrackTncsScreenView;", "Lau/com/woolworths/feature/shop/inbox/InboxUiEvent;", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TrackTncsScreenView implements InboxUiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final String f7280a;

        public TrackTncsScreenView(String campaignCode) {
            Intrinsics.h(campaignCode, "campaignCode");
            this.f7280a = campaignCode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TrackTncsScreenView) && Intrinsics.c(this.f7280a, ((TrackTncsScreenView) obj).f7280a);
        }

        public final int hashCode() {
            return this.f7280a.hashCode();
        }

        public final String toString() {
            return YU.a.h("TrackTncsScreenView(campaignCode=", this.f7280a, ")");
        }
    }
}
