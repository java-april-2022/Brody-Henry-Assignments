package com.caresoft.clinicapp;

public interface HIPPACompliantUser {
	abstract boolean assignPin(int pin);
    abstract boolean accessAuthorized(int confirmedAuthID);
}
