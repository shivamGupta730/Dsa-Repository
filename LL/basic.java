package LL;
// basic implementation
// 📚 Apni khud ki Linked List class - naam rakha 'basic'
public class basic {

    // 🧱 Node class: ek dabba jisme data aur agle dabbe ka link hota hai
    class Node {
        int data;     // 📦 Yeh data store karega
        Node next;    // 🔗 Yeh agle node ka address rakhega
    }

    // 📌 Linked List ke main 3 cheezein
    private Node head;  // ⬅️ Pehla node
    private Node tail;  // ➡️ Aakhri node
    private int size;   // 🔢 Kitne nodes hai total

    // ➕ Starting me naya node daalne ke liye
    public void addFirst(int item) {
        Node nn = new Node();  // 🆕 Naya node banaya
        nn.data = item;        // 📥 Data bhara

        if (size == 0) {
            // 🪫 Agar list khaali hai to head & tail dono wahi node
            head = nn;
            tail = nn;
        } else {
            // 🔗 Naye node ka next purane head ko point karega
            nn.next = head;
            head = nn;  // 🏁 Head ko update kar diya
        }
        size++;  // ⬆️ Size ek badh gaya
    }

    // ➕ Last me node daalna ho to
    public void addLast(int item) {
        if (size == 0) {
            // 📍 Agar list khaali hai to addFirst se hi kaam ho jaayega
            addFirst(item);
        } else {
            Node nn = new Node();
            nn.data = item;
            tail.next = nn;  // 🔗 Purane tail ka next naye node se jod do
            tail = nn;       // 🎯 Tail ko naye node pe le jao
            size++;
        }
    }

    // 🔍 Kisi index pe kaunsa node hai, yeh batayega
    private Node getNode(int K) {
        Node temp = head;  // 🔁 Head se start karenge
        for (int i = 0; i < K; i++) {
            temp = temp.next;  // 👉 Next pe jaate rahenge
        }
        return temp;  // 🎯 Mil gaya node, bhej diya
    }

    // ➕ Beech mein kisi index pe node insert karne ke liye
    public void addAtIndex(int item, int k) {
        if (k == 0) {
            // 🎯 Agar starting me daalna hai
            addFirst(item);
        } else if (k == size) {
            // 🏁 Agar end me daalna hai
            addLast(item);
        } else {
            Node nn = new Node();
            nn.data = item;

            Node k_1th = getNode(k - 1);  // 📍 Pehle wale tak jao
            nn.next = k_1th.next;        // 🔗 Naya node agle wale se jod do
            k_1th.next = nn;             // 🔗 Pehle wale se naye node ko jod do

            size++;  // ⬆️ Size badha do
        }
    }

    // 📤 First node ka data return karega
    public int getFirst() {
        return head.data;
    }

    // 📤 Last node ka data return karega
    public int getLast() {
        return tail.data;
    }

    // 📤 Kisi index ke node ka data return karega
    public int getIndex(int k) {
        return getNode(k).data;  // 🎯 getNode se node lao, data return karo
    }

    // 📺 Linked List ko print karne ke liye
    public void Display() {
        Node temp = head;  // 🎥 Temp se list traverse karenge
        while (temp != null) {
            System.out.print(temp.data + "->");  // 💬 Data print karo
            temp = temp.next;                    // 👉 Aage badho
        }
        System.out.println("null");  // 🛑 End of list
    }

    // ➖ Pehla node hatao aur uska data return karo
    public int removeFirst() {
        if (size == 0) {
            // ❌ Agar list khaali hai to hataana mumkin nahi
            throw new RuntimeException("List khaali hai bhai, kya hataayein?");
        }

        int rv = head.data;  // 🎁 Head ka data store kiya

        if (size == 1) {
            // 🧍 Sirf ek node tha, toh sab null
            head = null;
            tail = null;
        } else {
            Node temp = head;
            head = head.next;  // 👉 Head ko aage badhaya
            temp.next = null;  // 🔗 Purana head ka link tod diya
        }

        size--;  // 📉 Size ghataya
        return rv;  // 🔙 Data wapas bhej diya
    }
    // ➖ Last node ko list se hataata hai aur uska data return karta hai
    public int removeLast() {
        // 🧍‍♂️ Agar list mein sirf ek hi node hai, toh removeFirst se kaam chalao
        if (size == 1) {
            return removeFirst();
        } else {
            // 🎁 Tail ka data store kar lo return karne ke liye
            int rv = tail.data;

            // 🔙 Second last node pe jaane ke liye (size-2 index pe)
            Node sl = getNode(size - 2);

            // ✂️ Uska link hata do last node se (null set karo)
            sl.next = null;

            // 🏁 Tail ko update kar do second last node pe
            tail = sl;

            // 📉 Size ek kam kar do
            size--;

            // 🔙 Hata hua data return kar do
            return rv;
        }
    }


    // 🧪 Test karne ke liye
    public static void main(String[] args) {
        basic ll = new basic();  // 🏗️ Apni list ka object banaya

        ll.addFirst(10);  // ➕ 10 ko start me daala
        ll.addFirst(20);  // ➕ 20 ko start me daala
        ll.addFirst(30);  // ➕ 30 ko start me daala

        ll.Display();     // 📺 30->20->10->null

        ll.addLast(9);    // ➕ 9 ko end me daala

        ll.Display();     // 📺 30->20->10->9->null
    }
}
