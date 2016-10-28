package studentOrientation.attributes;

import studentOrientation.enums.BookStore;
import studentOrientation.enums.CampusTour;
import studentOrientation.enums.DormSelector;
import studentOrientation.enums.Registration;

public class CarbonFootprint implements CarbonFootprintI {
  double value;
  public void addFootprintTonnes(BookStore bookStoreIn) {
    if(bookStoreIn == BookStore.mandoBooks) { value = 0.02; }
    else if(bookStoreIn == BookStore.buBookStore) { value = 0; }
    return value;
  }
  public void addFootprintTonnes(CampusTour tourIn) {
    if(tourIn == CampusTour.busRide) { value = 0.1; }
    else if(tourIn == CampusTour.onFoot) { value = 0; }
    return value;
  }
  public void addFootprintTonnes(DormSelector dormIn) {
    if(dormIn == DormSelector.standOutside) { value = 0; }
    else if(dormIn == DormSelector.gamingContest) { value = 0.01; }
    return value;
  }
  public void addFootprintTonnes(Registration registrationIn) {
    if(registrationIn == Registration.computerLab) { value = 0.01; }
    else if(registrationIn == Registration.registrar) { value = 0; }
    return value;
  }
}
