package com.konfigthis.client;

import com.konfigthis.client.api.BytesDifferenceDataApi;
import com.konfigthis.client.api.EditedPagesDataApi;
import com.konfigthis.client.api.EditorsDataApi;
import com.konfigthis.client.api.EditsDataApi;
import com.konfigthis.client.api.FeedContentAvailabilityApi;
import com.konfigthis.client.api.LegacyDataApi;
import com.konfigthis.client.api.MathApi;
import com.konfigthis.client.api.PageviewsDataApi;
import com.konfigthis.client.api.RegisteredUsersDataApi;
import com.konfigthis.client.api.TransformApi;
import com.konfigthis.client.api.UniqueDevicesDataApi;

public class Wikimedia {
    private ApiClient apiClient;
    public final BytesDifferenceDataApi bytesDifferenceData;
    public final EditedPagesDataApi editedPagesData;
    public final EditorsDataApi editorsData;
    public final EditsDataApi editsData;
    public final FeedContentAvailabilityApi feedContentAvailability;
    public final LegacyDataApi legacyData;
    public final MathApi math;
    public final PageviewsDataApi pageviewsData;
    public final RegisteredUsersDataApi registeredUsersData;
    public final TransformApi transform;
    public final UniqueDevicesDataApi uniqueDevicesData;

    public Wikimedia() {
        this(null);
    }

    public Wikimedia(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.bytesDifferenceData = new BytesDifferenceDataApi(this.apiClient);
        this.editedPagesData = new EditedPagesDataApi(this.apiClient);
        this.editorsData = new EditorsDataApi(this.apiClient);
        this.editsData = new EditsDataApi(this.apiClient);
        this.feedContentAvailability = new FeedContentAvailabilityApi(this.apiClient);
        this.legacyData = new LegacyDataApi(this.apiClient);
        this.math = new MathApi(this.apiClient);
        this.pageviewsData = new PageviewsDataApi(this.apiClient);
        this.registeredUsersData = new RegisteredUsersDataApi(this.apiClient);
        this.transform = new TransformApi(this.apiClient);
        this.uniqueDevicesData = new UniqueDevicesDataApi(this.apiClient);
    }

}
