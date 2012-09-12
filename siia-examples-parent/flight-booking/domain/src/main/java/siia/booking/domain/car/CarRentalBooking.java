package siia.booking.domain.car;

import siia.booking.domain.FinancialAmount;

/**
 * @author Jonas Partner
 */
public class CarRentalBooking {

    private final String confirmationId;

    private final CarRental rental;

    private final FinancialAmount rentalCost;

    private final boolean paid;


    public CarRentalBooking(String confirmationId, CarRental rental, FinancialAmount rentalCost, boolean paid) {
        this.confirmationId = confirmationId;
        this.rental = rental;
        this.rentalCost = rentalCost;
        this.paid = paid;
    }

    public String getConfirmationId() {
        return confirmationId;
    }

    public CarRental getRental() {
        return rental;
    }

    public FinancialAmount getRentalCost() {
        return rentalCost;
    }

    public boolean isPaid() {
        return paid;
    }
}
