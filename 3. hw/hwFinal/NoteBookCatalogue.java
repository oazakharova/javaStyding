import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class NoteBookCatalogue {

    private static final Set<NoteBook> noteBookCatalogue = new HashSet<>();

    public boolean addNoteBook(NoteBook noteBook) {
        return noteBookCatalogue.add(noteBook);
    }

    public boolean deleteNoteBook(NoteBook noteBook) {
        return noteBookCatalogue.remove(noteBook);
    }

    public List<NoteBook> getByRAM(int ram) {
        return noteBookCatalogue.stream().filter(noteBook -> noteBook.getRam() >= ram).collect(Collectors.toList());
    }

    public List<NoteBook> getByHardDiskCapacity(int hardDiskCapacity) {
        return noteBookCatalogue.stream().filter(noteBook -> noteBook.getHardDiskCapacity() >= hardDiskCapacity)
                .collect(Collectors.toList());
    }

    public List<NoteBook> getByOS(String os) {
        return noteBookCatalogue.stream().filter(noteBook -> noteBook.getOs().equals(os)).collect(Collectors.toList());
    }

    public List<NoteBook> getByColour(String colour) {
        return noteBookCatalogue.stream().filter(noteBook -> noteBook.getColour().equals(colour))
                .collect(Collectors.toList());
    }

}
